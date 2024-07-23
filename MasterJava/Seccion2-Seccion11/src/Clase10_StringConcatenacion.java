public class Clase10_StringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));

        System.out.println(numeroA + numeroB + detalle);

        // Cuando utilizamos "+" estamos usando una instancia del StringBuilder para poder concatenar

        // los string son inmutables, no cambian
        // no estoy editando, estoy creando otra instancia.
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
