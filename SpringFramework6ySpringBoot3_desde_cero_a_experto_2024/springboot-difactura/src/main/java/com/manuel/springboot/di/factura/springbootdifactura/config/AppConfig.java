package com.manuel.springboot.di.factura.springbootdifactura.config;

import com.manuel.springboot.di.factura.springbootdifactura.models.Item;
import com.manuel.springboot.di.factura.springbootdifactura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice(){
        Product p1 = new Product("Camara Sony",800);
        Product p2 = new Product("Bicicleta Bianchi 26",1200);

        return Arrays.asList(new Item(p1,2), new Item(p2,4));
    }


}
