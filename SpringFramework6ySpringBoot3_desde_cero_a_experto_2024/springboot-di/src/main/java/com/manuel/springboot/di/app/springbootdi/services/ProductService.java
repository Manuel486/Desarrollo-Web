package com.manuel.springboot.di.app.springbootdi.services;

import com.manuel.springboot.di.app.springbootdi.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
