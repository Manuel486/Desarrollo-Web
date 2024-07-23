package set;

import modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",3));

        // HashSet compara con el equals, primero evalua si tienen la misma referencia, luego evalua cada uno de los
        // atributos, para eso debeos usar el equals y hashcode.
        // En el caso de equals puede dar el caso que tenga mismo nombre, pero diferente nota o el caso contrario, pero
        // no pueden ser lo mismo para ambos casos.
        
        //System.out.println(sa);

        // Formas de iterar
        System.out.println("Iterando usando un foreach");
        for (Alumno a : sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream foreach");
        sa.forEach(a -> System.out.println(a.getNombre()));
        // sa.forEach(System.out::println);
    }
}
