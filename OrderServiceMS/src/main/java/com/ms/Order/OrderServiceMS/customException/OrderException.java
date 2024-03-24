package com.ms.Order.OrderServiceMS.customException;

import lombok.Data;

@Data
public class OrderException extends Exception{
	
	private String code;
	
	public OrderException(String code,String msg) {
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
