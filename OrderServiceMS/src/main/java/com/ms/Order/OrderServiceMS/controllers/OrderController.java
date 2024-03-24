package com.ms.Order.OrderServiceMS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.Order.OrderServiceMS.customException.OrderException;
import com.ms.Order.OrderServiceMS.data.OrderData;
import com.ms.Order.OrderServiceMS.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService os;
	
	@RequestMapping("/place")
	public ResponseEntity<Long> placeOrder(@RequestBody OrderData od){
		Long orderId = os.placeOrder(od);
		return new ResponseEntity<Long>(orderId,HttpStatus.OK);
	}
	
	@RequestMapping("/get/{id}")
	public OrderData getOrder(@PathVariable String id) throws NumberFormatException, OrderException{
		OrderData order = os.getOrder(id);
		return order;
	}
	
}
