package org.example.tiendabackend.services.impls;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.example.tiendabackend.model.dao.ProductDao;
import org.example.tiendabackend.model.dto.ProductDto;
import org.example.tiendabackend.model.entities.Category;
import org.example.tiendabackend.model.entities.Product;
import org.example.tiendabackend.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {


    @Autowired
    private ProductDao productoDao;

    @Override
    public List<Product> listAll() {
        return productoDao.findAll();
    }

    @Transactional
    @Override
    public Product save(ProductDto productDto) {
        Category category = Category.builder()
                .id(productDto.getCategoryId())
                .build();
        Product product = Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .stock(productDto.getStock())
                .description(productDto.getDescription())
                .characteristics(productDto.getCharacteristics())
                .category(category)
                .registrationDate(new Date())
                .updateDate(new Date())
                .build();

        return productoDao.save(product);
    }
}
