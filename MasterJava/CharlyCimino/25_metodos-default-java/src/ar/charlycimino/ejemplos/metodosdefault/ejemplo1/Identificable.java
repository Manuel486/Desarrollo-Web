package ar.charlycimino.ejemplos.metodosdefault.ejemplo1;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public interface Identificable {

    public default void mostrarIdentificacion() {
        System.out.println(hashCode());
    }
}
