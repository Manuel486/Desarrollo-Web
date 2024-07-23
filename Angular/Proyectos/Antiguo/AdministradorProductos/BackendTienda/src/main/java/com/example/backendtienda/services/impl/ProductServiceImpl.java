package com.example.backendtienda.services.impl;

import com.example.backendtienda.model.Product;
import com.example.backendtienda.repository.ProductRepository;
import com.example.backendtienda.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.getReferenceById(productId);
    }

    @Override
    public boolean deleteProduct(Long productId) {
        try {
            productRepository.deleteById(productId);
            return true;
        } catch (EmptyResultDataAccessException e){
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
