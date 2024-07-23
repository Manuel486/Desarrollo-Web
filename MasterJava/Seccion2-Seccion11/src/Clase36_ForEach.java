public class Clase36_ForEach {
    public static void main(String[] args) {

        // foreach -> Permite recorrer los elementos de una colección uno por uno, simplificando
        // la sintaxis y haciendo que el código sea más legible.

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
