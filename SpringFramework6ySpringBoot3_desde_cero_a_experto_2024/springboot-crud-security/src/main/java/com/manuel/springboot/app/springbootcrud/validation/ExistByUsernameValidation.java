package com.manuel.springboot.app.springbootcrud.validation;

import com.manuel.springboot.app.springbootcrud.services.UserService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExistByUsernameValidation implements ConstraintValidator<ExistByUsername, String> {

    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        if (userService == null){
            return true;
        }
        return !userService.existsByUsername(username);
    }
}
