package org.example.tiendabackend.controllers;

import org.example.tiendabackend.model.dto.ProductDto;
import org.example.tiendabackend.model.entities.Product;
import org.example.tiendabackend.model.payload.MessageResponse;
import org.example.tiendabackend.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/producto")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){
        List<Product> products = productService.listAll();

        return new ResponseEntity<>(
                MessageResponse.builder()
                        .message("")
                        .object(products)
                        .build()
                , HttpStatus.OK
        );
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody ProductDto productDto){
        Product productSave = null;
        try {
            productSave = productService.save(productDto);
            return new ResponseEntity<>(
                    MessageResponse.builder()
                            .message("Guardado correctamente")
                            .object(ProductDto.builder()
                                    .id(productSave.getId())
                                    .name(productSave.getName())
                                    .price(productSave.getPrice())
                                    .stock(productSave.getStock())
                                    .description(productSave.getDescription())
                                    .characteristics(productSave.getCharacteristics())
                                    .categoryId(productSave.getCategory().getId())
                                    .build()
                            )
                            .build()
                    , HttpStatus.CREATED
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
