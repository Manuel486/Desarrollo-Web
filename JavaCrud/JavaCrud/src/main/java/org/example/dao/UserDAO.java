package org.example.dao;

import org.example.modelo.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    User getUserById(int userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}
