import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1L,"Frank","Moraz");

        Address address1 = new Address(1L,"El verjel",1234);
        Address address2 = new Address(2L,"Vasco de Gama",9875);

        client.getAddresses().add(address1);
        client.getAddresses().add(address2);


        Address prueba = new Address(2L,"Vasco de Gama",9875);

        client.getAddresses().remove(prueba);

        client.getAddresses().forEach(System.out::println);

    }
}