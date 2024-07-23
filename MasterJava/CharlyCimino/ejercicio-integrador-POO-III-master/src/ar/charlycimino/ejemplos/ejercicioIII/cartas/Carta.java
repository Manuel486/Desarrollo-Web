package ar.charlycimino.ejemplos.ejercicioIII.cartas;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public abstract class Carta {

    private boolean tapada;

    public Carta() {
        // Por defecto, 'tapada' es false
        this.tapada = true;
    }

    public void darVuelta() {
        tapada = !tapada;
    }

    public boolean isTapada() {
        return tapada;
    }
    
    public void mostrar() {
        if (tapada) {
            System.out.println("**************");
        } else {
            System.out.println(getRepresentacion());
        }
    }

    // Este método debe ser abstracto 
    public String getRepresentacion() {
        return "Carta genérica";
    }

}
