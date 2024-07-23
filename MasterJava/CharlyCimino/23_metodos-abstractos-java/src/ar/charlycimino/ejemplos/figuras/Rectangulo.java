package ar.charlycimino.ejemplos.figuras;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

}
