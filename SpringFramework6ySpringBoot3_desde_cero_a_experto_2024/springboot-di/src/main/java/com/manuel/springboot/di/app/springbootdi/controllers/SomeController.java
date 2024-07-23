package com.manuel.springboot.di.app.springbootdi.controllers;

import com.manuel.springboot.di.app.springbootdi.models.Product;
import com.manuel.springboot.di.app.springbootdi.services.ProductService;
import com.manuel.springboot.di.app.springbootdi.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    // Es para inyectar una instancia
    // Spring va a buscar el compomenente que implemente dicha interfaz
    // Puede haber problema si es que la interfaz se implementa en varios lugares, porque no sabrias cual traer
//    @Autowired
    private ProductService productService;

    public SomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id){
        return productService.findById(id);
    }
}
