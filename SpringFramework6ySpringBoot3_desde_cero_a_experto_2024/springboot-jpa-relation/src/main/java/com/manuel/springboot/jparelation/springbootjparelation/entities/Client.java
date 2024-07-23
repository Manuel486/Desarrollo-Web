package com.manuel.springboot.jparelation.springbootjparelation.entities;

import jakarta.persistence.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;

    // No es buena practica porque hara muchas consultas, por cada direccion hace una consulta
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "client_id") // ya no se crea una tabla intermedia, en direcciona se agrega la columna client_id
    @JoinTable(
            name = "tbl_clientes_to_direcciones",
            joinColumns = @JoinColumn(name = "id_cliente"),
            inverseJoinColumns = @JoinColumn(name = "id_direcciones"),
            uniqueConstraints =  @UniqueConstraint(columnNames = {"id_direcciones"}))
    private List<Address> addresses;

    // Antes de agregar el joincolumn creaba una tabla intermedia para relacionar address y client
    // Al agregar joincolumn ya no se creara la tabla intermedia, se agrega en la tabla address la columna client_id


    @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "client")
    private List<Invoice> invoices;

    public Client() {
        addresses = new ArrayList<>();
        invoices = new ArrayList<>();
    }

    public Client(String name, String lastname) {
        this();
        this.name = name;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Client addInvoice(Invoice invoice){
        invoices.add(invoice);
        invoice.setClient(this);

        return this;
    }

    @Override
    public String toString() {
        return MessageFormat.format("'{'id={0}, name=''{1}'', lastname=''{2}'', addresses={3}, invoices={4}'}'", id, name, lastname, addresses, invoices);
    }
}
