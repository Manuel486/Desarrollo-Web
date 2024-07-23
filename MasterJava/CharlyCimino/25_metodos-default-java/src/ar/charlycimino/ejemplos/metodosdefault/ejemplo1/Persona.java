package ar.charlycimino.ejemplos.metodosdefault.ejemplo1;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Persona implements Identificable {

    private String DNI;

    public Persona(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public void mostrarIdentificacion() {
        System.out.println(this.DNI);
    }
}
