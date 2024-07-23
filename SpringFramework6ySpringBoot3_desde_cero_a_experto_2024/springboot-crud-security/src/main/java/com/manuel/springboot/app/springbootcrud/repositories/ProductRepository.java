package com.manuel.springboot.app.springbootcrud.repositories;

import com.manuel.springboot.app.springbootcrud.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
    boolean existsBySku(String sku);
}
