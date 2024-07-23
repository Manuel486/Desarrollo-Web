import java.util.Arrays;

public class Clase5_EjemploArreglosForOrdenamientoBurbuja {


    public static void arregloInverso(String[] arreglo){
        int total2= arreglo.length;
        int total = arreglo.length;
        for(int i=0;i<total2;i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){


        int total = arreglo.length;
        int contador = 0;

        // Optimizando algoritmo burbuja
        for(int i=0;i<total-1;i++){
            for(int j=0; j<total-1-i;j++){
                if(((Comparable) (arreglo[j+1])).compareTo(arreglo[j]) < 0){ // Autoboxing
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("contador = "+contador);
    }

    public static void main(String[] args) {

        // String productos[] = new String[7]; // Es similar a ponerlo en String[]
        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        // Ordenarlo
        Arrays.sort(productos);


//        for(int i=0;i<total;i++){
//            for(int j=0; j<total;j++){
//                if(productos[i].compareTo(productos[j]) < 0){
//                    String auxiliar = productos[i];
//                    productos[i] = productos[j];
//                    productos[j] = auxiliar;
//                }
//                contador++;
//            }
//        }

        sortBurbuja(productos);

        for(int i=0;i<total;i++){
            System.out.println("para indice "+i+" : "+productos[i]);
        }


        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7"); // de forma automatica hace un Autoboxing
        numeros[2] = 35;
        numeros[3] = -1;


        sortBurbuja(numeros);

        for(int i=0; i< numeros.length; i++){
            System.out.println(" i = "+numeros[i]);
        }
    }
}
