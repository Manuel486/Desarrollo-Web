package com.manuel.springboot.app.springbootcrud.validation;

import com.manuel.springboot.app.springbootcrud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductValidation  implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.product.name");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotBlank.product.description");

        if ( product.getDescription() == null || product.getDescription().isBlank() ) {
            errors.rejectValue("description", "NotBlank.product.description");
        }

        if (product.getPrice() == null){
            errors.rejectValue("price", "NotNull.product.price");
        } else if(product.getPrice() < 500) {
            errors.rejectValue("price", "Min.product.price");
        }
    }
}
