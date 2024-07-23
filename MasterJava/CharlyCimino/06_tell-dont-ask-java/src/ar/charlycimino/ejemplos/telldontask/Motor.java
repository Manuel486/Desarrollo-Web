package ar.charlycimino.ejemplos.telldontask;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Motor {

    private String numero;
    private double cilindrada;
    private String tipo;
    private int rpmActuales;

    public Motor(String numero, double cilindrada, String tipo) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.rpmActuales = 0;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        }
    }

    public void acelerar() {
        this.rpmActuales = this.rpmActuales + 1000;
        // this.rpmActuales += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", cilindrada=" + cilindrada
                + ", tipo=" + tipo + ", rpmActuales=" + rpmActuales + '}';
    }

}
