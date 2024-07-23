package com.manuel.springboot.app.springbootcrud.services;

import com.manuel.springboot.app.springbootcrud.entities.Product;
import com.manuel.springboot.app.springbootcrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        // Devuelve un Iterable por eso es necesario el cast
        return (List<Product>) productRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> productOptional = productRepository.findById(id);

        if (productOptional.isPresent()){
            Product productDb = productOptional.orElseThrow();

            productDb.setName(product.getName());
            productDb.setDescription(product.getDescription());
            productDb.setPrice(product.getPrice());
            productDb.setSku(product.getSku());

            return Optional.of(productRepository.save(productDb));
        }

        return productOptional;
    }

    @Transactional
    @Override
    public Optional<Product> delete(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        productOptional.ifPresent(productDb -> {
            productRepository.delete(productDb);
        });

        return productOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsBySku(String sku) {
        return productRepository.existsBySku(sku);
    }
}
