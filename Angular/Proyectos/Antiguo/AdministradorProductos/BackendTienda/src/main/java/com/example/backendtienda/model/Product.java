package com.example.backendtienda.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "product")
    private Set<BuyDetail> detail;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
    private Double price;
    private int stock;
    private String supplier;
    private String image;
    private String[] descriptions;
}
