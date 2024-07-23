import java.util.Scanner;

public class Tareas {
    public static void main(String[] args) {
        //mostrarNumeros();
        ocurrencia();
    }

    public static void mostrarNumeros(){
        int[] arreglo = new int[10];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese los 10 números: ");
        for(int i=0;i<arreglo.length;i++){
            int numero = s.nextInt();
            arreglo[i] = numero;
        }

        System.out.println("Mostrando los numeros: ");
        for (int i=0;i<arreglo.length/2;i++){
            System.out.println(arreglo[i]+"  "+arreglo[arreglo.length-1-i]);
        }
    }

    public static void ocurrencia(){
        int[] arreglo = {1,3, 2, 3, 3,3, 4, 5, 5, 5, 6, 7};

        int contador=0, ocurrencias = 0,repetido = 0;

        for (int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length;j++){
                if(arreglo[i] == arreglo[j]){
                    contador++;
                }
            }
            if(contador>ocurrencias){
                ocurrencias = contador;
                repetido = arreglo[i];
            }
            contador = 0;
        }


        System.out.println("La mayor ocurrencia es : "+ocurrencias);
        System.out.println("El elemento que más se repite es : "+repetido);
    }

    public static void histograma(){
        int arreglo[] = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        for(int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo.length;j++){

            }
        }
    }
}
