import org.aguzman.poointerfaces.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.poointerfaces.repositorio.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano","Pérez"));
        repo.crear(new Cliente("Bea","González"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Andrés","Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println); // clientes.foreach(c -> System.out.println(c));

        System.out.println("===== paginable =====");
        // List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        List<Cliente> paginable = repo.listar(1,3);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clienteOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);
        for (Cliente c: clienteOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea","Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);

        List<Cliente> clienteOrdenAsc2 = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);
        for (Cliente c: clienteOrdenAsc2){
            System.out.println(c);
        }

    }
}