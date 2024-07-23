package com.manuel.springboot.di.app.springbootdi.repositories;

import com.manuel.springboot.di.app.springbootdi.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Arrays;
import java.util.List;

// Hace que se una instancia única, que se puede inyectar (Singleton)
//@Component
// Es un mecanisno para almacenar una colección de storage, se define a un componente que accede a los datos
@Repository("productList")
//@RequestScope
//@SessionScope
public class ProductRepositoryImpl implements ProductRepository {

    /*
    - RequestScope
        En Spring Boot, el "request scope" se refiere a la duración del bean gestionado por Spring dentro del
        contexto de una solicitud HTTP. Esto significa que cada vez que se envía una solicitud HTTP a la aplicación,
        se crea una instancia única del bean y se mantiene disponible durante la duración de esa solicitud específica.
        Una vez que se completa la solicitud, el bean se destruye.
    - SessionScope
        En Spring Framework, el alcance de sesión (session scope) se refiere a la duración de un bean dentro del contexto de
        una sesión HTTP. Esto significa que una instancia de bean con alcance de sesión persiste durante toda la duración de
        una sesión de usuario en una aplicación web.

        Cuando un usuario inicia sesión en una aplicación web, se crea una sesión HTTP para ese usuario. Todos los objetos
        con alcance de sesión asociados con esa sesión HTTP estarán disponibles mientras dure la sesión. Una vez que el
        usuario cierra la sesión o expira la sesión por inactividad, los objetos con alcance de sesión se destruyen.
     */
    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L,"Memoeria Corsarir 32",300L),
                new Product(2L,"Cpu Intel Core i9",850L),
                new Product(3L,"Teclado Razer Mini",180L),
                new Product(4L,"Motherboard Gigabyte",490L)
        );
    }

    @Override
    public List<Product> findAll() {
        return this.data;
    }

    @Override
    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
