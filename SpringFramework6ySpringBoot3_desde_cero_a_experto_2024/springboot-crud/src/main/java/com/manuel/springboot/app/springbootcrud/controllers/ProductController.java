package com.manuel.springboot.app.springbootcrud.controllers;

import com.manuel.springboot.app.springbootcrud.entities.Product;
import com.manuel.springboot.app.springbootcrud.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

//    @Autowired
//    private ProductValidation validation;

    @GetMapping
    public List<Product> list(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable Long id){
        Optional<Product> productOptional = productService.findById(id);
        if( productOptional.isPresent()){
            return ResponseEntity.ok(productOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }

    // El binding result debe estar al lado del objeto que debemos validar
    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody Product product, BindingResult result){
//        validation.validate(product,result);
        if(result.hasFieldErrors()){
            return validation(result);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@Valid @RequestBody Product product,BindingResult result,@PathVariable Long id){
//        validation.validate(product,result);
        if(result.hasFieldErrors()){
            return validation(result);
        }
        // Decide si se inserta o actualiza dependiendo del id el metodo save
        Optional<Product> productOptional = productService.update(id,product);
        if ( productOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.CREATED).body(productOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Product product = new Product();
        product.setId(id);
        Optional<Product> productOptional = productService.delete(id);
        if( productOptional.isPresent()){
            return ResponseEntity.ok(productOptional.orElseThrow());
        }

        return ResponseEntity.notFound().build();
    }

    private ResponseEntity<?> validation(BindingResult result) {
        Map<String,String> errors = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errors.put(err.getField(), "El campo " + err.getField() + " " +err.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }
    
}
