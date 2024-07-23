package com.example.backendtienda.services.impl;

import com.example.backendtienda.model.Category;
import com.example.backendtienda.repository.CategoryRepository;
import com.example.backendtienda.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Long categoryId) {
        return categoryRepository.getReferenceById(categoryId);
    }

    @Override
    public boolean deleteCategory(Long categoryId) {
        try {
            categoryRepository.deleteById(categoryId);
            return true;
        } catch (EmptyResultDataAccessException e){
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
