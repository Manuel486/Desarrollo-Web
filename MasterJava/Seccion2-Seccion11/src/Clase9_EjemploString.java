public class Clase9_EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // implicita
        String curso2 = new String("Programación Java"); // explicita

        boolean esIgual = curso == curso2; // son diferentes instancias
        System.out.println("curso == curso2 = " + esIgual);

        // equals -> Compara si dos objetos son iguales en terminos de contenido

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java ";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
