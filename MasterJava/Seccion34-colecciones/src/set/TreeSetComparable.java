package set;

import modelo.Alumno;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {
        // Si uso la clase TreeSet debe implementar la clase comparable
        // Set<Alumno> sa = new TreeSet<>();
        // Estoy sobrescribiendo el comparaTo
        // Set<Alumno> sa = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Zeus",2));

        // El TreeSet evalua si un elemento esta repetido en base al compareTo, es decir no esta comparando el objeto,
        // solo compara el valor de alguna de los atributos, ya sea el nombre o la nota para este caso

        System.out.println(sa);
    }
}
