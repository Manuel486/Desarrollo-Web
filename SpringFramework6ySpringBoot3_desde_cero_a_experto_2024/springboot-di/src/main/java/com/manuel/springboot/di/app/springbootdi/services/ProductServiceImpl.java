package com.manuel.springboot.di.app.springbootdi.services;

import com.manuel.springboot.di.app.springbootdi.models.Product;
import com.manuel.springboot.di.app.springbootdi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//@Component
@Service
public class ProductServiceImpl implements ProductService {

    // Estamos proveyendo una instancia del ProductoRepository
//    @Autowired
    private ProductRepository repository;

    @Value("${config.value}")
    private Double value;

    // Cuando pasamos un componente de spring no es necesario colocar el autowired, estamos inyectando
    public ProductServiceImpl(@Qualifier("productRepositoryJson") ProductRepository repository) {
        this.repository = repository;
    }
    // Si no hubiera colocoado el Qualifier por defecto hubiera injectado el foo

    @Override
    public List<Product> findAll(){
        return  repository.findAll().stream().map(p -> {
            Double primeImp = p.getPrice() * value;
//            Product newProduct = new Product(p.getId(),p.getName(),primeImp.longValue());
            Product newProduct = p.clone();
            newProduct.setPrice(primeImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id){
        return repository.findById(id);
    }
}
