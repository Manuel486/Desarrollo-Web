package com.manuel.springboot.app.springbootcrud.validation;

import com.manuel.springboot.app.springbootcrud.services.ProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class IsExistsDbValidation implements ConstraintValidator<IsExistsDb,String> {

    @Autowired
    private ProductService productService;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (productService == null){
            return true;
        }
        return !productService.existsBySku(value);
    }
}
