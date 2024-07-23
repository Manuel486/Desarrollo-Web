package org.example.dao;

import org.example.modelo.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMemory implements UserDAO{

    List<User> lista;

    public UserDaoMemory() {
        this.lista = new ArrayList<>();
    }

    @Override
    public List<User> getAllUsers() {
        return lista;
    }

    @Override
    public User getUserById(int userId) {
        for (User user: lista){
            if(user.getId() == userId){
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        this.lista.add(user);
    }

    @Override
    public void updateUser(User user) {
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getId() == user.getId()){
                lista.set(i, user);
                break;
            }
        }
    }

    @Override
    public void deleteUser(int userId) {
        for (User user: lista){
            if(user.getId() == userId){
                lista.remove(user);
                break;
            }
        }
    }
}
