package ar.charlycimino.ejemplos.metodosdefault.ejemplo1;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona("1234");
        Reserva r = new Reserva();
        Automovil a = new Automovil();

        p.mostrarIdentificacion();
        r.mostrarIdentificacion();
        a.mostrarIdentificacion();
    }

}
