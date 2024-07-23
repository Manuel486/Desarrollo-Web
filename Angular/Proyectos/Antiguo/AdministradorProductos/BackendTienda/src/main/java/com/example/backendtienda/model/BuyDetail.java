package com.example.backendtienda.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BuyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "buy_id")
    private Buy buy;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int units;
    private Double unitPrice;
    private Double subTotal;
}
