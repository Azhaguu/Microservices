package com.ms.Order.OrderServiceMS.Model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private Long productId;
	private BigDecimal prodPrice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public BigDecimal getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(BigDecimal prodPrice) {
		this.prodPrice = prodPrice;
	}
	
}
