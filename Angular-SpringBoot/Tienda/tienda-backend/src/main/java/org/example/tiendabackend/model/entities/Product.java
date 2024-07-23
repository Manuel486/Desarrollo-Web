package org.example.tiendabackend.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name =  "productos")
public class Product {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private String description;
    private String characteristics;

    @ManyToOne
    @JoinColumn(name = "categoria")
    private Category category;

    private Date registrationDate;
    private Date updateDate;
}
