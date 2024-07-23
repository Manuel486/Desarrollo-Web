package com.manuel.springboot.error.springbooterror.controllers;

import com.manuel.springboot.error.springbooterror.exception.UserNotFoundException;
import com.manuel.springboot.error.springbooterror.models.domain.User;
import com.manuel.springboot.error.springbooterror.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public String index() {
//        int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public User show(@PathVariable(name = "id") Long id){
//        Forma sin usar optional
//        User user  = userService.findById(id);
//        if( user == null){
//            throw new UserNotFoundException("Error el usuario no existe!");
//        }
        User user = userService.findById(id).orElseThrow(() -> new UserNotFoundException("Error el usuario no existe"));

        System.out.println(user.getLastname());
        return user;
    }

    // Otra forma de manejar las expceciones
    @GetMapping("/show2/{id}")
    public ResponseEntity<?> show2(@PathVariable(name = "id") Long id){
        Optional<User> optionalUser = userService.findById(id);
        if(optionalUser.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(optionalUser.orElseThrow());
    }
}
