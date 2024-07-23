import java.util.Arrays;

public class Clase2_EjemploArreglosFor {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        int totalNumeros = numeros.length;

        for (int i=0;i<totalNumeros;i++){
            numeros[i]=i*3;
        }

        for (int i=0;i<totalNumeros;i++){
            System.out.println("numeros = "+numeros[i]);
        }


        // -------------------------------------------------


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

        System.out.println("=== Usando foreach ===");
        for(String prod: productos){
            System.out.println("prod = "+prod);
        }

        System.out.println("=== Usando while ===");
        int i =0;
        while(i<total){
            System.out.println("para indice "+i+" : "+productos[i]);
            i++;
        }

        System.out.println("=== Usando do while ===");
        int j =0;
        do{
            System.out.println("para indice "+j+" : "+productos[j]);
            j++;
        } while (j<total);

    }
}
