package com.std.ec.mybatiscrud.service;

import com.std.ec.mybatiscrud.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(int id);
    int deleteById(int id);
    int save(Product item);
    int update(int id, Product item);
}