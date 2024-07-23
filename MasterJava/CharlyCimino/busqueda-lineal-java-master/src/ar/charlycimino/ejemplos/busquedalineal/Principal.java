package ar.charlycimino.ejemplos.busquedalineal;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Concesionaria c = new Concesionaria("FakeCar");

        // Autos para testear
        c.agregarAuto(new Auto("ABC123", "Rojo", 1003));
        c.agregarAuto(new Auto("DEF456", "Negro", 4000));
        c.agregarAuto(new Auto("BCD234", "Verde", 2000));
        c.agregarAuto(new Auto("DEF458", "Blanco", 4000));
        c.agregarAuto(new Auto("CDE345", "Azul", 3000));
        c.agregarAuto(new Auto("DEF457", "Gris", 4000));

        //Auto a = c.buscarAuto("cualquierCosa");
        Auto a = c.buscarAuto("bcd234");
        if (a == null) {
            System.out.println("No se encontró");
        } else {
            System.out.println("Se encontró: " + a);
        }
    }
}
