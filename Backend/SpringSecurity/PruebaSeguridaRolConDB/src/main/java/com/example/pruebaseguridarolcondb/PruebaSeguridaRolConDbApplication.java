package com.example.pruebaseguridarolcondb;

import com.example.pruebaseguridarolcondb.model.ERole;
import com.example.pruebaseguridarolcondb.model.RoleEntity;
import com.example.pruebaseguridarolcondb.model.UsuarioEntity;
import com.example.pruebaseguridarolcondb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class PruebaSeguridaRolConDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSeguridaRolConDbApplication.class, args);
	}

	@Autowired
	UsuarioRepository usuarioRepository;

	@Bean
	CommandLineRunner init(){
		return args -> {
			UsuarioEntity usuarioEntity = UsuarioEntity.builder()
					.nombre("manuel")
					.password("1234")
					.roles(Set.of(RoleEntity.builder()
							.nombre(ERole.valueOf(ERole.ADMIN.name()))
							.build()))
					.build();

			usuarioRepository.save(usuarioEntity);
		};
	}

}
