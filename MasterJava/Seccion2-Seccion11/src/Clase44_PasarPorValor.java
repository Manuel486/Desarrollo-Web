public class Clase44_PasarPorValor {
    public static void main(String[] args) {
        // toda variable primitiva se pasa por valor, no por referencia porque no es un objeto
        // Si usaramos integer tampoco cambiaria el valor.
        // Float, Double, String, Integer, Char, etc. todos son inmutables.
        int i = 10;

        System.out.println("iniciamos el método main con i = "+i);
        test(i);
        System.out.println("Finaliza el método main con el valor de i = "+i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test con i = "+i);
        i = 35;
        System.out.println("Finaliza el método test con i = "+i);
    }
}
