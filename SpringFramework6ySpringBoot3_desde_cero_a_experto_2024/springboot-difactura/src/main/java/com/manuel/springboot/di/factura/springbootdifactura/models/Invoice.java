package com.manuel.springboot.di.factura.springbootdifactura.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description}")
    private String description;

    @Autowired
    private List<Item> items;

    public Invoice() {
        System.out.println("Creando el componente de la factura");
        System.out.println(client);
    }

    @PostConstruct
    public void init() {
        System.out.println("Creando el componente de la factura");
        System.out.println(client);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destruyendo el componente o bean invoice!");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal(){
        int total = 0;
        for (Item item: items){
            total += item.getImporte();;
        }
        return  total;
    }
}
