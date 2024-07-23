package com.manuel.curso.springboot.webapp.springbootweb.controllers;

import com.manuel.curso.springboot.webapp.springbootweb.models.User;
import com.manuel.curso.springboot.webapp.springbootweb.models.dto.ParamDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
//    @Value("${config.message}")
//    private String message;
    // Por defecto toma las comas como separado de elementos
    @Value("${config.listOfValues}")
    private String[] listOfValues;
    @Value("${config.code}")
    private Integer code;

    //  SpEL (Spring Expression Language)
    @Value("#{ '${config.listOfValues}'.split(',') }")
    private List<String> valueList;

    @Value("#{ '${config.listOfValues}' }")
    private String valueString;

    @Value("#{ ${config.valuesMap} }")
    private Map<String, Object> valuesMap;

    @Value("#{ ${config.valuesMap}.product }")
    private String product;

    @Autowired
    private Environment environment;

    @GetMapping(value = {"/baz/{message}","/baz"})
    public ParamDto baz(@PathVariable(required = false) String message){
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/multiple-variables/{message}/{code}")
    public ParamDto getEmployeesByIdAndNameWithMapVariable(@PathVariable Map<String, String> pathVarsMap) {
        String message = pathVarsMap.get("message");
        Integer code = Integer.valueOf(pathVarsMap.get("code"));

        ParamDto paramDto = new ParamDto();
        paramDto.setCode(code);
        paramDto.setMessage(message);

        return paramDto;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){
        // hacer algo con el usuario save en la bbdd
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values( @Value("${config.message}") String message){
        Map<String,Object> json = new HashMap<>();
        json.put("username",username);
        json.put("code",code);
        json.put("message",message);
        json.put("listOfValues",listOfValues);
        json.put("valueList",valueList);
        json.put("valueString",valueString);
        json.put("valuesMap",valuesMap);
        json.put("product",product);
        json.put("environmet_message",environment.getProperty("config.message"));
        json.put("environmet_code",Integer.valueOf(environment.getProperty("config.code")));
        json.put("environmet_code2",environment.getProperty("config.code",Long.class));

        return json;
    }
}
