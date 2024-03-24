package com.ms.Order.OrderServiceMS.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@FeignClient(name = "ProductServiceMS/product")
public interface OrderFeignProduct {

	@GetMapping("/get/{id}")
	@ResponseBody
	public Long getProduct(@PathVariable String id);
	
}
