public class Main {

    /*
        Las colecciones -> sirven para almacenar objetos, agrupar y tiene dos grandes tipos: Collection y Map
        - Collection : List, Set y Map
        - List alamcena objetos en una secuencia determinar
        - Set no permite duplicado

        -----------------------------
        List
            - ArrayList : cuando ya se llena, agrega mas espacio, con la mitad del espacio que falta
            - LinkedList : es una lista doble enlazada, es excelente para trabajar con pilas
            - Vector : Cuando quiero trabajar con hilos

        -----------------------------
        Set (No permite duplicados)
            - HashSet : los eelementos son desordenados, usa el algoritmo hascode, lo cual permitira comparar si un
                        objeto ya existe.
            - TreeSet : es ordenado, pero esto causa problemas con el rendimiento porque cada vez que agrego algo
                        tiene que volver a ordenar.
            - LinkedHasSet : combina el hashSet con una lista enlazada

        -----------------------------
        Map (clave - valor)
            - HashMap : utiliza hashcode, para poder compararse, ya que todas las llaves deben ser unicos
            - TreeNao : es un mapa ordenado

     */

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}