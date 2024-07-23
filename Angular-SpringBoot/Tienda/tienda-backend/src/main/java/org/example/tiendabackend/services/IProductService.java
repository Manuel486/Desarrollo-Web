package org.example.tiendabackend.services;

import org.example.tiendabackend.model.dao.ProductDao;
import org.example.tiendabackend.model.dto.ProductDto;
import org.example.tiendabackend.model.entities.Product;

import java.util.List;

public interface IProductService {

    List<Product> listAll();

    Product save(ProductDto productoDto);
}
