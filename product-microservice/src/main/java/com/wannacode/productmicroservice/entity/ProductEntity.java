package com.wannacode.productmicroservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value="product")
public class ProductEntity {
	@Id
	private String id;
	private String productName;
	private String productDescription;
	private Double unitPrice;	
}
