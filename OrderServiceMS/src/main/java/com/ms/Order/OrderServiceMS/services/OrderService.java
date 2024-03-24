package com.ms.Order.OrderServiceMS.services;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.Order.OrderServiceMS.Model.OrderModel;
import com.ms.Order.OrderServiceMS.customException.OrderException;
import com.ms.Order.OrderServiceMS.data.OrderData;
import com.ms.Order.OrderServiceMS.feign.OrderFeignProduct;
import com.ms.Order.OrderServiceMS.repos.OrderRepo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class OrderService {
	
	@Autowired
	private OrderRepo or;
	
	@Autowired
	private OrderFeignProduct feignProduct;
	
	public Long placeOrder(OrderData od) {
		OrderModel om = new OrderModel();
		if(od!=null) {
			om.setId(od.getId());
			om.setProductId(od.getProductId());
			om.setProdPrice(od.getProdPrice());
			or.save(om);
		}
		return om.getId();
	}
	
	public OrderData getOrder(String id) throws NumberFormatException, OrderException {
		OrderData od = new OrderData();
		OrderModel model = or.findById(Long.valueOf(id)).orElseThrow(() -> new OrderException("Order_Not_Found","Order not found"));
		System.out.println("Order id : "+model.getId());
		od.setId(model.getId());
		od.setProductId(feignProduct.getProduct(String.valueOf(model.getProductId())));
		od.setProdPrice(model.getProdPrice());
		return od;
	}
	
}
