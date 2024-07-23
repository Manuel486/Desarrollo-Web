public class Clase13_StringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = "+esNulo);

        if (esNulo) {
            curso  = " ";//"Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();

        System.out.println("esVacio2 = "+esVacio2);

        boolean esBlanco = curso.isBlank(); // sabemos si tiene un caracter de espacio
        System.out.println("esBlanco = "+esBlanco);
        // retorna true si es vacio o si contiene espacios en blanco


        if (esBlanco == false) {
            System.out.println("Bievenido al curso ".concat(curso)); // da error porque si es nulo
            System.out.println("Bievenido al curso " + curso); // escribe null
        }
    }
}
