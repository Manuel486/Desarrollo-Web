package org.example.tiendabackend.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class ProductDto implements Serializable {
    private Integer id;
    private String name;
    private Double price;
    private Integer stock;
    private String description;
    private String characteristics;
    private Integer categoryId;
}