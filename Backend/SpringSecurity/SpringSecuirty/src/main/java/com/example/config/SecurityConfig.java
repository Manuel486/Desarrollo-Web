package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Configuration one
//   @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        /*
//            - HttpSecuritu --> Es una clase que nos ayuda a configurar la seguridad en spring
//            - csrf() --> (Cross- Site Request Forgery) es la seguridad, por ejemplo cuando los formularios
//              envian una petición a la base de datos estos csrf pueden interceptarlos. Estas seguridad nos
//              esta proveyendo, no esta protegiendo contra esa vulnerabilidad de interceptores
//            - authorizeHttpRequest --> configurar las urls que van a estar protegidas
//            - requestMatcher --> Son las peticiones que coincidan con los endpoint, son los que voy a permitir
//            - anyRequest --> Hace referencia a cualquier otra petición
//            - and --> Se utiliza para agregar más configuraciones
//            - build --> retorna el SecurityFilterChain
//        */
//
//        return http.authorizeHttpRequests()
//                    .requestMatchers("/v1/index2").permitAll()
//                    .anyRequest().authenticated()
//                .and()
//                .formLogin().permitAll()
//                .and()
//                .httpBasic() // Se enviaria las credenciales en el header
//                .and()
//                .build();
//    }

    // Configuration two
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests( auth -> {
                    auth.requestMatchers("/v1/index2").permitAll();
                    auth.anyRequest().authenticated();
                })
                .formLogin()
                    .successHandler(successHandler()) // URL a donde se va a ir despúes de iniciar sesión
                    .permitAll()
                .and()
                .sessionManagement() //Nos sirve para configurar el comportamiento de las sesiones
                    // ALWAYS -> crear una sesion siempre y cuando no existe
                    // IF_REQUIRED -> crea una sesión si solo es necesario
                    // NEVER -> no crea ni una sesión, pero si existe una sesión lo va a utilizar
                    // STATELESS -> no crea ni una sesión, tampoco trabaja con sesiones existentes
                    .sessionCreationPolicy(SessionCreationPolicy.ALWAYS) // ALWAYS - IF_REQUIRED - NEVER - STATELESS
                    .invalidSessionUrl("/login") // url para reedirigir si no logueo de manera correcta
                    .maximumSessions(1)
                    .expiredUrl("/login") // Si se cumple la expiración de esa sesión a donde lo vamos a redirigir
                    .sessionRegistry(sessionRegistry()) // Administramos todos los registros que estan en la sesión
                .and()
                .sessionFixation() //
                    // migrateSession -> Si se evalua que esta bajo un ataque de sesion, va a generar un nuevo id
                    // newSession -> Crear una sesion en blanco
                    // none -> Inhabilita complementamente la seguridad en contra de la fijación
                    .migrateSession()
                .and()
                .build();
    }

    @Bean
    public SessionRegistry sessionRegistry(){
        return new SessionRegistryImpl();
    }
    public AuthenticationSuccessHandler successHandler(){
        return ((request, response, authentication) -> {
            response.sendRedirect("v1/session");
        });
    }
}
