package com.wannacode.productmicroservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wannacode.productmicroservice.entity.ProductEntity;
import com.wannacode.productmicroservice.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
@RefreshScope
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<ProductEntity> getAllProducts() {
		return productRepository.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}

}
