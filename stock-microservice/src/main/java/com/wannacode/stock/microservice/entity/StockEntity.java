package com.wannacode.stock.microservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tmp_auxiliar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="campo1")
	private String id;
	
	@Column(name="campo2")
	private String code;
	
	@Column(name="campo3")
	private String quantity;
	
}
