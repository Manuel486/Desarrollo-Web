package com.example.backendtienda.repository;

import com.example.backendtienda.model.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyRepository extends JpaRepository<Buy,Long> {

}
