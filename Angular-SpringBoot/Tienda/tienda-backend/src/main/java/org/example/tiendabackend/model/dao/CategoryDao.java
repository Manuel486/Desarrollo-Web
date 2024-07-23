package org.example.tiendabackend.model.dao;

import org.example.tiendabackend.model.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
