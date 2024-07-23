package com.example.backendtienda.controllers;

import com.example.backendtienda.model.Category;
import com.example.backendtienda.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping
    public List<Category> getAllCategories(){
        return  categoryService.getAllCategories();
    }

    @PostMapping
    public Category addCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
}
