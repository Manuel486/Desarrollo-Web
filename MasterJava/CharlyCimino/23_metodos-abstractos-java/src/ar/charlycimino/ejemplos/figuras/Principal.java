package ar.charlycimino.ejemplos.figuras;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Rectangulo(2, 2, "Verde"));
        figuras.add(new Circunferencia(1, "Roja"));
        figuras.add(new Rectangulo(1, 2, "Amarillo"));
        figuras.add(new Circunferencia(2, "Azul"));
        figuras.add(new TrianguloEquilatero(4, "Naranja"));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.perimetro());
        }
    }

}
