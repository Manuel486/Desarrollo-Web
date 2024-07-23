package com.manuel.springboot.app.springbootcrud.services;

import com.manuel.springboot.app.springbootcrud.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User save(User user);
    boolean existsByUsername(String username);
}
