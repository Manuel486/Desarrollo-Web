package com.example.backendtienda.controllers;

import com.example.backendtienda.model.Product;
import com.example.backendtienda.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping()
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
