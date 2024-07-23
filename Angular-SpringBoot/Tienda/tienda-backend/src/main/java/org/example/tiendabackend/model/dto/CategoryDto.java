package org.example.tiendabackend.model.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@Builder
public class CategoryDto {
    private Integer id;
    private String name;
    private String description;
}