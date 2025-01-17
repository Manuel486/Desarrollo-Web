package ar.charlycimino.ejemplos.constructorsuper;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Moto extends Vehiculo {

    private int anchoDeManubrio;

    // TAREA: Implementá el constructor de 'Moto' siguiendo las pautas de 'Auto'.

    public Moto(int anchoDeManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoDeManubrio = anchoDeManubrio;
    }
    
    public void hacerWheelie() {
        System.out.println("Haciendo la wheelie...");
    }
}
