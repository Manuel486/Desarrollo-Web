package com.std.ec.model.dao;

import com.std.ec.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// El PagingAndSortingRepository contiene los metodos de Crud y Jpa Repository
public interface ClienteDao extends CrudRepository<Cliente,Integer> {
    
}
