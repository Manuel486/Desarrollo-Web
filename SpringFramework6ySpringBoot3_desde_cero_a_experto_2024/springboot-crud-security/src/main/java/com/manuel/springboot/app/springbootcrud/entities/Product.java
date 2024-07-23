package com.manuel.springboot.app.springbootcrud.entities;

import com.manuel.springboot.app.springbootcrud.validation.IsExistsDb;
import com.manuel.springboot.app.springbootcrud.validation.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // NotBlank y NotEmpty es para objetos, NotNull es para objetos
    @NotEmpty(message = "{NotEmpty.product.name}")
    @Size(min = 3, max = 20)
    private String name;
    @Min(value = 500, message = "{Min.product.price}")
    @NotNull(message = "{NotNull.product.price}")
    private Integer price;

//    @NotEmpty
//    @NotBlank(message = "{NotBlank.product.description}") // Valida que no sea un caracter en blaco " "
    @IsRequired
    private String description;

    @IsRequired
    @IsExistsDb
    private String sku;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
