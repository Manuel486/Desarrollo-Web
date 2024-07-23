package com.example.pruebaseguridarolcondb.repository;

import com.example.pruebaseguridarolcondb.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<RoleEntity,Long> {
}
