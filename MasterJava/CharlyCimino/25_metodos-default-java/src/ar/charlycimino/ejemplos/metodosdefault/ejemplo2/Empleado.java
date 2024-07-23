package ar.charlycimino.ejemplos.metodosdefault.ejemplo2;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public interface Empleado {

    public default void realizarTarea() {
        System.out.println("Realizo tarea porque me pagan por ello");
    }
}
