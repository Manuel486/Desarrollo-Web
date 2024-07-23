package com.std.ec.contactoscrud.repositorio;


import com.std.ec.contactoscrud.models.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto,Integer> {
}
