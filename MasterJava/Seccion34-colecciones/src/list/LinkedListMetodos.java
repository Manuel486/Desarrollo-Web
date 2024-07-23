package list;

import modelo.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListMetodos {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = "+enlazada.size());
        System.out.println("esta vacia = "+enlazada.isEmpty());
        enlazada.add(new Alumno("Pato",5));
        enlazada.add(new Alumno("Cata",6));
        enlazada.add(new Alumno("Luci",4));
        // Desplazamos su posicion
        enlazada.add(new Alumno("Jano",7));
        enlazada.add(new Alumno("Andres",3));

        System.out.println(enlazada + ", size = "+enlazada.size());

        enlazada.addFirst(new Alumno("Zeus",5));
        enlazada.addLast(new Alumno("Atenea",6));

        System.out.println(enlazada + ", size = "+enlazada.size());

        System.out.println("Primero = "+enlazada.getFirst());
        // La diferenia entre peekLast y getLast, es que el segundo lanza una excepcion si no lo encuentra,
        // el primero devuelve null si no lo encuentra.
        System.out.println("Ultimo = "+enlazada.peekLast());
        System.out.println("Indice 2 = "+enlazada.get(2));

        // Elimina y devuelve el elemento eliminado
        enlazada.removeFirst(); // lanza excepcion si no existe
        enlazada.removeLast();

        // pop -> elimina y retorna el primer elemento, lanza excepcion si no existe

        // Elimina el primer elemento
        enlazada.remove();

        Alumno a = new Alumno("Lucas",5);
        enlazada.addLast(a);

        System.out.println("Indice de Lucas = "+enlazada.indexOf(a));

        System.out.println(enlazada);

        enlazada.set(3, new Alumno("Lalo",7));

        System.out.println(enlazada);


        // ListIterator
        ListIterator<Alumno> li = enlazada.listIterator();

        while (li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }

        System.out.println("============= Previous");
        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
