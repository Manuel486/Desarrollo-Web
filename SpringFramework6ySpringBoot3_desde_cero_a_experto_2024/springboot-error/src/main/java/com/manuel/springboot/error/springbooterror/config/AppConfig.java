package com.manuel.springboot.error.springbooterror.config;

import com.manuel.springboot.error.springbooterror.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L,"Pepe","Gonzalez"));
        users.add(new User(2L,"Maria","Ramirez"));
        users.add(new User(3L,"Manuel","Fuentes"));
        users.add(new User(4L,"Josefa","Gutierrez"));
        return users;
    }
}
