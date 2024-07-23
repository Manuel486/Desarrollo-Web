package ar.charlycimino.ejemplos.maxmin;

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

        System.out.println("Autos con mayor cant de kms recorridos: " + c.autosMasKmsRecorridos());
        //System.out.println("Auto con menor cant de kms recorridos: " + c.autoMenosKmsRecorridos());

    }

}
