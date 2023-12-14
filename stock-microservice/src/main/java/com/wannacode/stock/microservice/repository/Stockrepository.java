package com.wannacode.stock.microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wannacode.stock.microservice.entity.StockEntity;

public interface Stockrepository extends JpaRepository<StockEntity, String> {
	
Optional<StockEntity> findByCode(String code);

}
