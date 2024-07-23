package ar.charlycimino.ejemplos.figuras;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class TrianguloEquilatero extends FiguraGeometrica {

    private double lado;

    public TrianguloEquilatero(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 3 * lado;
    }

}
