package com.manuel.curso.springboot.webapp.springbootweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        // Solución para permitir las tildes y ñ
//        @PropertySource(value = "classpath:values.properties", encoding = "UTF-8"),
        @PropertySource(value = "classpath:values.properties"),
})
public class ValuesConfig {
}
