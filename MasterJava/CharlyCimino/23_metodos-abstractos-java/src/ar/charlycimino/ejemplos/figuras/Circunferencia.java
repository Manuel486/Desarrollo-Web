package ar.charlycimino.ejemplos.figuras;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Circunferencia extends FiguraGeometrica {

    private double radio;

    public Circunferencia(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * this.radio * Math.PI;
    }

}
