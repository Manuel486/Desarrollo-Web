package org.example.tiendabackend.model.dao;

import org.example.tiendabackend.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
