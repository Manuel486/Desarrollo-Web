package ar.charlycimino.ejemplos.dependencia;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Documento doc1 = new Documento("Prueba", "Este es un\ntexto de prueba");
        Impresora imp = new Impresora();

        imp.encender();
        imp.imprimir(doc1);
    }

}
