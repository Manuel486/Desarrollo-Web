package list;

import modelo.Alumno;

import java.util.ArrayList;
import java.util.List;


public class ArrayListMetodos {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = "+al.size());
        System.out.println("esta vacia = "+al.isEmpty());
        al.add(new Alumno("Pato",5));
        al.add(new Alumno("Cata",6));
        al.add(new Alumno("Luci",4));
        // Desplazamos su posicion
        al.add(2,new Alumno("Jano",7));
        al.add(3,new Alumno("Andres",3));

        System.out.println(al + ", size = "+al.size());

        // Primero compara las referencias
        // Realiza la eliminación con el equals, ambos atriutos deben ser iguales
        al.remove(new Alumno("Jano",7));
        // al.remove(0);


        System.out.println(al + ", size = "+al.size());

        boolean b = al.contains(new Alumno("Cata",6));
        System.out.println("La lista contiene a Jano = "+b);

        Object a[] = al.toArray();
        for (int i=0; i<a.length;i++){
            System.out.println("Desde el arreglo = "+a[i]);
        }

    }
}
