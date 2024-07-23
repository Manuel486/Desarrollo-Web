package com.manuel.curso.springboot.webapp.springbootweb.controllers;

import com.manuel.curso.springboot.webapp.springbootweb.models.dto.ParamDto;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.Param;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {


    /*
        La anotación @RequestParam es una herramienta importante para manejar peticiones HTTP entrantes en Spring.
        Permite el mapeo de los parámetros de la petición a parámetros de método, lo que permite pasar datos de la
        petición al método que maneja la solicitud.
     */
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola que tal", name = "mensaje") String message) {
        // Si no pongo el nombre por defecto es el nombre de la variable, pero por convención deberia ser igual
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    // En caso pasara una letra en vez de un número ocurriria una expceción, este tipo de situacion se manejan de
    // forma diferente
    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code){
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        paramDto.setCode(code);
        return paramDto;
    }

    @GetMapping("/request")
    public ParamDto bar(HttpServletRequest request){
        Integer code = 0;
        try{
            code = Integer.valueOf(request.getParameter("code"));
        } catch (NumberFormatException e){
        }
        ParamDto paramDto = new ParamDto();
        paramDto.setCode(code);
        paramDto.setMessage(request.getParameter("message"));

        return paramDto;
    }
}
