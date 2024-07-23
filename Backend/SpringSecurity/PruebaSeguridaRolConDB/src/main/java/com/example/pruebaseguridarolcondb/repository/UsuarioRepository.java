package com.example.pruebaseguridarolcondb.repository;

import com.example.pruebaseguridarolcondb.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {
    UsuarioEntity findByNombre(String nombre);
}
