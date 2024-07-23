package set;

import java.util.*;

public class HashSetAgregar {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);

        // Los set no se pueden ordenar
        //Collections.sort(hs);

        // List<String> lista = new ArrayList<>(hs);
        // Collections.sort(lista);

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados ? "+b);
        System.out.println(hs);
    }
}
