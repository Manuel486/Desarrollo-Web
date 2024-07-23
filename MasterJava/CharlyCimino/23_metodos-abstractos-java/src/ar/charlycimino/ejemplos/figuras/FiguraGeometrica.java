package ar.charlycimino.ejemplos.figuras;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public abstract class FiguraGeometrica {

    private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public abstract double perimetro();
}
