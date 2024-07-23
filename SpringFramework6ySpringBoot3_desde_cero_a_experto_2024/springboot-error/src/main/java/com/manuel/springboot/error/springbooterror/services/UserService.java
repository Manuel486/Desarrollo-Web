package com.manuel.springboot.error.springbooterror.services;

import com.manuel.springboot.error.springbooterror.models.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
}
