package ar.charlycimino.ejemplos.dependencia;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Impresora {

    private boolean estaEncendida;

    public void encender() {
        estaEncendida = true;
    }

    public void imprimir(Documento doc) {
        if (estaEncendida) {
            System.out.println("Imprimiendo doc " + doc.getTitulo());
            System.out.println("****************");
            System.out.println(doc.getCuerpo());
            System.out.println("****************");
        } else {
            System.out.println("Impresora apagada!");
        }
    }
}
