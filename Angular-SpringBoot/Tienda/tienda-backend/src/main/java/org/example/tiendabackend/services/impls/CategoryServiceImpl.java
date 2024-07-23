package org.example.tiendabackend.services.impls;

import org.example.tiendabackend.model.dao.CategoryDao;
import org.example.tiendabackend.model.dto.CategoryDto;
import org.example.tiendabackend.model.entities.Category;
import org.example.tiendabackend.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> listAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category save(CategoryDto categoryDto) {
        Category category = Category.builder()
                .id(categoryDto.getId())
                .name(categoryDto.getName())
                .description(categoryDto.getDescription())
                .registrationDate(new Date())
                .updateDate(new Date())
                .build();
        return categoryDao.save(category);
    }
}
