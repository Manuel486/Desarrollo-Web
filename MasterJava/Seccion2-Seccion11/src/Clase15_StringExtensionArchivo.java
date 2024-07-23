public class Clase15_StringExtensionArchivo {
    public static void main(String[] args) {
/*
        String archivo = "alguna.imagen.pdf";

        StringBuilder archivoBuilder = new StringBuilder(archivo).reverse();
        archivoBuilder = new StringBuilder(archivoBuilder.substring(0, archivoBuilder.indexOf("."))).reverse();
        System.out.println(archivoBuilder);

*/

      String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("El valor de i es : "+i);
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i));



      /*  String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\.");
        int length = archivoArr.length;
        System.out.println(archivoArr[length-1]);*/

    }
}
