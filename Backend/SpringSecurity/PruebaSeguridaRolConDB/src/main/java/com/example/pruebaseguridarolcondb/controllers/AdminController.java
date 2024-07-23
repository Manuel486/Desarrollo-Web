package com.example.pruebaseguridarolcondb.controllers;

import com.example.pruebaseguridarolcondb.model.UsuarioEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String getAdminDashboard(){
        return "Bienvenido al dashboard de administrador";
    }

    @GetMapping("/users")
    public String getAllUsers(){
        return "Obtener usuarios";
    }
}
