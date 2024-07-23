import java.util.Arrays;

public class Clase1_EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7"); // de forma automatica hace un Autoboxing
        numeros[2] = 35;
        numeros[3] = -1;
        // numeros[4] = 5; // Solo podemos tener 4 elementos

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length-1];
        // int m = numeros[4];



        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


        // -------------------------------------------------


        // String productos[] = new String[7]; // Es similar a ponerlo en String[]
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 64gb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        // Ordenarlo
        Arrays.sort(productos);

        System.out.println("productos[0] = "+productos[0]);
        System.out.println("productos[1] = "+productos[1]);
        System.out.println("productos[2] = "+productos[2]);
        System.out.println("productos[3] = "+productos[3]);
        System.out.println("productos[4] = "+productos[4]);
        System.out.println("productos[5] = "+productos[5]);
        System.out.println("productos[+] = "+productos[6]);


    }
}
