package com.example.backendtienda.repository;

import com.example.backendtienda.model.BuyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyDetailRepository extends JpaRepository<BuyDetail,Long> {
}
