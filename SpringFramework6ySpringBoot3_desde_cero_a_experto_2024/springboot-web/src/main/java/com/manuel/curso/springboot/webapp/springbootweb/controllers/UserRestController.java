package com.manuel.curso.springboot.webapp.springbootweb.controllers;


import java.util.*;

import com.manuel.curso.springboot.webapp.springbootweb.models.User;
import com.manuel.curso.springboot.webapp.springbootweb.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details2")
    public Map<String,Object> details() {
        User user = new User("Manuel","Chunga");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);
        return body;
    }

    @GetMapping("/details2-map")
    public UserDto detailsMap() {
        User user = new User("Manuel","Chunga");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Manuel","Chunga");
        User user2 = new User("Pepe","Vargas");
        User user3 = new User("John","Doe");

//        List<User> users = new ArrayList<>();
//        users.add(user);
//        users.add(user2);
//        users.add(user3);

        return Arrays.asList(user,user2,user3);
    }

}
