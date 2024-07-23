package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PruebaCollections {
    public static void main(String[] args) {

        // Implementando Comparable
        System.out.println("======== PERSONAS =========");

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Manuel",24));
        usuarios.add(new Usuario("Jose",27));
        usuarios.add(new Usuario("Piero",15));

        Collections.sort(usuarios);

        for (Usuario usuario : usuarios){
            System.out.println(usuario);
        }

        // Usando clases anonimas
        System.out.println("======== PRODUCTOS CON CLASES ANONIMAS =========");
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Televisor",1000));
        productos.add(new Producto("Bicicleta",500));
        productos.add(new Producto("Radio",800));

        Collections.sort(productos, new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                int valor = 0;
                if (o1.getPrecio()>o2.getPrecio()){
                    valor = 1;
                } else if (o1.getPrecio()<o2.getPrecio()){
                    valor = -1;
                }
                return valor;
            }
        });

        for (Producto producto: productos){
            System.out.println(producto);
        }


        // Usando clases anonimas
        System.out.println("======== PRODUCTOS CON STREA, =========");
        Collections.sort(productos, (o1, o2) -> {
            int valor = 0;
            if (o1.getPrecio()>o2.getPrecio()){
                valor = 1;
            } else if (o1.getPrecio()<o2.getPrecio()){
                valor = -1;
            }
            return valor;
        });

        List<Producto> productosordenados =  productos.stream().sorted(Comparator.comparingDouble(Producto::getPrecio)).toList();
    }
}
