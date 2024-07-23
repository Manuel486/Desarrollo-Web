package org.aguzman.poointerfaces.generics;

import org.aguzman.poointerfaces.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.poointerfaces.modelo.ClientePremiun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemplosGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzmán"));

        Cliente andres = clientes.get(0);

        Cliente[] clientesArray = {new Cliente("Andres", "Guzmán"), new Cliente("Lucci", "Martines")};

        Integer[] enteros = {1, 2, 3};

        List<Cliente> clientes2 = fromArrayToList(clientesArray);
        List<Integer> enterosLista = fromArrayToList(enteros);

        clientes2.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Luci"}, enteros);

        nombres.forEach(System.out::println);

        List<ClientePremiun> clientePremiunsList = fromArrayToList(new ClientePremiun[]{new ClientePremiun("Paco", "Fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientePremiunsList);

        System.out.println("Máximo de 1, 9 y 4 es: "+maximo(1,9,4));
        System.out.println("Máximo de 3.9, 11.6, 7.78 es: "+maximo(3.9,11.6,7.78));
        System.out.println("Máximo de zanahoria, arándanos, manzanas es : "+maximo("zanahoria","arándanos","manzanas"));
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Implemente Comparable
    public static <T extends Cliente & Comparator<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento : g) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a,T b,T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }

        return max;
    }
}
