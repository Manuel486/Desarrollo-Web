import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Clase4_EjemploArreglosForInversoMutable {


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

        System.out.println("=== Usando for ===");
        // El i usado es variable local del metodo
        for(int i=0;i<total;i++){
            System.out.println("para indice "+i+" : "+productos[i]);
        }

        /*for(int i=0;i<total/2;i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i] = inverso;
            productos[total-1-i] = actual;
        }*/

        System.out.println("=== Utilizando el metodo ===");
        arregloInverso(productos);

        // System.out.println("=== Utilizando Collections ===");
        // Collections.reverse(Arrays.asList(productos));

        // El i usado es variable local del metodo
        for(int i=0;i<total;i++){
            System.out.println("para indice "+i+" : "+productos[i]);
        }

    }
}
