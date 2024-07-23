package com.manuel.springboot.jparelation.springbootjparelation;

import com.manuel.springboot.jparelation.springbootjparelation.entities.Address;
import com.manuel.springboot.jparelation.springbootjparelation.entities.Client;
import com.manuel.springboot.jparelation.springbootjparelation.entities.Invoice;
import com.manuel.springboot.jparelation.springbootjparelation.repositories.ClientRepository;
import com.manuel.springboot.jparelation.springbootjparelation.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootJpaRelationApplication implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaRelationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        oneToManyBidireccional();
    }

    @Transactional
    public void oneToManyBidireccional() {
        Client client = new Client("Frank", "Moraz");

        Invoice invoice1 = new Invoice("compras de la casa",5000L);
        Invoice invoice2 = new Invoice("compras de oficina",8000L);

        client.addInvoice(invoice1)
                .addInvoice(invoice2);

        clientRepository.save(client);
    }

        @Transactional
    public void removeAddressFindById(){
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address1 = new Address("El verjel",1234);
            Address address2 = new Address("Vasco de Gama",9875);

            client.setAddresses(Arrays.asList(address1,address2));

            clientRepository.save(client);

            System.out.println(client);

            Optional<Client> optionalClient2 = clientRepository.findOne(2L);
            optionalClient2.ifPresent(c -> {
                Address address3 = c.getAddresses().get(1);
                c.getAddresses().remove(address3); // Lo elimino de la lista
                clientRepository.save(c);
                System.out.println(c);
            });
        });

    }

    @Transactional
    public void removeAddress(){
        Client client = new Client("Frank","Moraz");

        Address address1 = new Address("El verjel",1234);
        Address address2 = new Address("Vasco de Gama",9875);

        client.getAddresses().add(address1);
        client.getAddresses().add(address2);

        // De forma automatica tambien guarda las direcciones gracias al CASCADE.ALL
        clientRepository.save(client);

        System.out.println(client);

        Optional<Client> optionalClient = clientRepository.findById(3L);
        optionalClient.ifPresent(c -> {
            System.out.println("================= Su ID ES : "+address1.getId());
            c.getAddresses().remove(address1); // Lo elimino de la lista
            clientRepository.save(c);
            System.out.println(c);
        });
    }

    @Transactional
    public void oneToManyFindById(){
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address1 = new Address("El verjel",1234);
            Address address2 = new Address("Vasco de Gama",9875);

            client.setAddresses(Arrays.asList(address1,address2));
            // No puedo hacerlo de esta forma porque en ese momento la lista no esta cargada
//            client.getAddresses().add(address1);
//            client.getAddresses().add(address2);

            // De forma automatica tambien guarda las direcciones gracias al CASCADE.ALL
            clientRepository.save(client);

            System.out.println(client);
        });

    }

    @Transactional
    public void oneToMany(){
        Client client = new Client("Frank","Moraz");

        Address address1 = new Address("El verjel",1234);
        Address address2 = new Address("Vasco de Gama",9875);

        client.getAddresses().add(address1);
        client.getAddresses().add(address2);

        // De forma automatica tambien guarda las direcciones gracias al CASCADE.ALL
        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void manyToOne(){
        Client client = new Client("John","Ramirez");
        clientRepository.save(client);

        Invoice invoice = new Invoice("Compras de oficina",2000L);
        invoice.setClient(client);

        Invoice invoiceDB = invoiceRepository.save(invoice);
        System.out.println(invoiceDB);
    }

    @Transactional
    public void manyToOneFindByIdClient(){
        Optional<Client> optionalClient = clientRepository.findById(1L);

        if(optionalClient.isPresent()){
            Client client = optionalClient.orElseThrow();

            Invoice invoice = new Invoice("Compras de oficina",2000L);
            invoice.setClient(client);

            Invoice invoiceDB = invoiceRepository.save(invoice);
            System.out.println(invoiceDB);
        }
    }
}
