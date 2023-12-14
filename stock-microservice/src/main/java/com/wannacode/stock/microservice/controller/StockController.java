package com.wannacode.stock.microservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wannacode.stock.microservice.entity.StockEntity;
import com.wannacode.stock.microservice.repository.Stockrepository;

@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	private Stockrepository stockrepository;
	
	public boolean stockAvailable(@PathVariable String code) {
		Optional<StockEntity> stock=stockrepository.findByCode(code);
		stock.orElseThrow(()->new RuntimeException("No se puede encontrar el producto"));
		return stock.get().getQuantity()!="";
	}
}
