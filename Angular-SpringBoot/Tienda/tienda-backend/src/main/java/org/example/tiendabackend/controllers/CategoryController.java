package org.example.tiendabackend.controllers;

import org.example.tiendabackend.model.dto.CategoryDto;
import org.example.tiendabackend.model.entities.Category;
import org.example.tiendabackend.model.payload.MessageResponse;
import org.example.tiendabackend.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public ResponseEntity<?> getAllCategories(){
        List<Category> categories = categoryService.listAll();

        return new ResponseEntity<>(
                MessageResponse.builder()
                        .message("")
                        .object(categories)
                        .build()
                , HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CategoryDto categoryDto){
        Category categorySave = null;
        try{
            categorySave = categoryService.save(categoryDto);
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .message("Categoria guardada correctamente")
                            .object(CategoryDto.builder()
                                    .id(categorySave.getId())
                                    .name(categorySave.getName())
                                    .description(categorySave.getDescription())
                                    .build())
                            .build()
                    , HttpStatus.OK
            );
        } catch (DataAccessException exception){
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .message(exception.getMessage())
                            .object(null)
                            .build()
                    , HttpStatus.METHOD_NOT_ALLOWED
            );
        }
    }
}
