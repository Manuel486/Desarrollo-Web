package com.manuel.springboot.di.app.springbootdi.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manuel.springboot.di.app.springbootdi.models.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ProductRepositoryJson implements ProductRepository{
    private List<Product> list;

    // Podriamos trabajar de esta manera si declaramos este repositorio como Componente
    // El value no funciona en un contexto que no sea de spring
//    @Value("classpath:json/product.json")
//    private Resource resource;

    public ProductRepositoryJson() {
        Resource resource = new ClassPathResource("json/product.json");
        // ObjectMapper permite convertir un archivo o un InpuSteam a un objeto de java
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(Long id) {
        return list.stream().filter(p -> {
            return p.getId().equals(id);
        }).findFirst().orElseThrow();
    }
}
