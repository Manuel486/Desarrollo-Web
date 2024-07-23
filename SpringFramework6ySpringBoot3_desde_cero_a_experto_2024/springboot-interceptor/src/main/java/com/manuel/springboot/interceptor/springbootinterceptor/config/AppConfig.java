package com.manuel.springboot.interceptor.springbootinterceptor.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig  implements WebMvcConfigurer {

    @Autowired
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor).addPathPatterns("/app/bar","/app/foo"); // Tambien se puede poner /app/**, indica que se ejecuta en todos
//        registry.addInterceptor(timeInterceptor).excludePathPatterns("/app/bar","/app/foo"); // Excluye a todos menos a foo
    }
}