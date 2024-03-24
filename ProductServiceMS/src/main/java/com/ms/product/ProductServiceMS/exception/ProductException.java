package com.ms.product.ProductServiceMS.exception;

public class ProductException extends Exception {

	private String code;
	
	public ProductException(String code,String msg) {
		super(msg);
		this.code=code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}

