package ar.charlycimino.ejemplos.maxmin;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Auto {

    private String patente;
    private String color;
    private int kmsRecorridos;

    public Auto(String patente, String color, int kmsRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmsRecorridos = kmsRecorridos;
    }

    public int getKmsRecorridos() {
        return kmsRecorridos;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kmsRecorridos=" + kmsRecorridos + '}';
    }
}
