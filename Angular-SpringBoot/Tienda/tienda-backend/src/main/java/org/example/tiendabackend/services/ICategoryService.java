package org.example.tiendabackend.services;


import org.example.tiendabackend.model.dto.CategoryDto;
import org.example.tiendabackend.model.dto.ProductDto;
import org.example.tiendabackend.model.entities.Category;
import org.example.tiendabackend.model.entities.Product;

import java.util.List;

public interface ICategoryService {
    List<Category> listAll();

    Category save(CategoryDto categoryDto);
}
