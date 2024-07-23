package com.example.backendtienda.services;

import com.example.backendtienda.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Product product);
    Product getProduct(Long productId);
    boolean deleteProduct(Long productId);
}
