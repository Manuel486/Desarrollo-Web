package com.manuel.springboot.jparelation.springbootjparelation.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Long total;

    @ManyToOne
    @JoinColumn(name = "client_id") // El dueño de la relacion es donde el joinColumn
    private Client client; // Si no colocamos el nombre por defecto toma el client_id

    public Invoice() {
    }

    public Invoice(String description, Long total) {
        this.description = description;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Borar el client porque se volveria un ciclo infinito
    @Override
    public String toString() {
        return "{id=%d, description='%s', total=%d}".formatted(id, description, total, client);
    }
}
