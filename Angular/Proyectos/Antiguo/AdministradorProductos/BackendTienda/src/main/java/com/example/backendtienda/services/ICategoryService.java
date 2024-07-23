package com.example.backendtienda.services;


import com.example.backendtienda.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategories();
    Category createCategory(Category category);
    Category updateCategory(Category category);
    Category getCategory(Long categoryId);
    boolean deleteCategory(Long categoryId);
}
