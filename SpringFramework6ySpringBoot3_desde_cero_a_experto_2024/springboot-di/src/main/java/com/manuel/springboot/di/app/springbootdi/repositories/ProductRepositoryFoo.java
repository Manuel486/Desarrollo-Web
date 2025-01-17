package com.manuel.springboot.di.app.springbootdi.repositories;

import com.manuel.springboot.di.app.springbootdi.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

// Solo uno puede ser primary
//@Primary
@Repository
public class ProductRepositoryFoo implements ProductRepository{
    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"Monitor Asus 27",600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id,"Monitor Asus 27",600L);
    }
}
