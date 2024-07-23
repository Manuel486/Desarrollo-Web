package com.std.ec.springbootweb.controllers;

import com.std.ec.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/page")
public class UserController {

    // Model sirve pasar datos desde el controlador a la vista
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Manuel","Chunga",null);

        model.addAttribute("title","Hola Mundo Spring Boot");
        // model.addAttribute("name","Manuel");
        // model.addAttribute("lastname","Chunga");
        model.addAttribute("user",user);
        return "details"; // Solo se coloca el nombre, no la extension
    }

    @GetMapping("/list")
    public String list(ModelMap model){
//        List<User> users = Arrays.asList(
//                new User("Pepa", "Gonzales", null),
//                new User("Lalo", "Perez","lalo@gmail.com"),
//                new User("Juanita", "Roe","juanita@gmail.com"),
//                new User("Andres","Guzman",null)
//        );

//        model.addAttribute("users",users);
        model.addAttribute("title","Lista de usuarios");
        return "list";
    }

    // Es un atributo global
    @ModelAttribute("users")
    public List<User> userModel(){
        return Arrays.asList(
                new User("Pepa", "Gonzales", null),
                new User("Lalo", "Perez","lalo@gmail.com"),
                new User("Juanita", "Roe","juanita@gmail.com"),
                new User("Andres","Guzman",null)
        );
    }

}

