package com.manuel.springboot.interceptor.springbootinterceptor.controllers;

import com.manuel.springboot.interceptor.springbootinterceptor.interceptors.LoadingTimeInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/app")
public class FooController {

    private static final Logger logger = LoggerFactory.getLogger(FooController.class);

    @GetMapping("/foo")
    public Map<String, String> foo() {
        return Collections.singletonMap("message","handler foo del controlador");
    }

    @GetMapping("/bar")
    public Map<String, String> bar() {
        logger.info("Mensaje desde el controlador, en la ruta bar");
        return Collections.singletonMap("message","handler bar del controlador");
    }

    @GetMapping("/baz")
    public Map<String, String> baz() {

        return Collections.singletonMap("message","handler baz del controlador");
    }

}
