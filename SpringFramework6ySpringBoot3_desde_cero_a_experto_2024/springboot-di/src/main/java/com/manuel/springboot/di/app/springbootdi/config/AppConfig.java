package com.manuel.springboot.di.app.springbootdi.config;

import com.manuel.springboot.di.app.springbootdi.repositories.ProductRepository;
import com.manuel.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

    // Otra forma de crear una Component
//    @Bean("productJson") // Cambiando el nombre
    @Bean
    @Primary
    public ProductRepository productRepositoryJson() {
        return new ProductRepositoryJson();
    }
}
