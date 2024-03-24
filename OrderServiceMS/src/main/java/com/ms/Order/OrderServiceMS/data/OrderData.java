package com.ms.Order.OrderServiceMS.data;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderData {
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
