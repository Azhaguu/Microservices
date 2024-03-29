package com.getway.APIGateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/orderFallBack")
	public String orderFallBach() {
		return "Order service is down,try after some time";
	}
	
	@GetMapping("/productFallBack")
	public String productFallBach() {
		return "Product service is down,try after some time";
	}
	
	@GetMapping("/paymentFallBack")
	public String paymentFallBach() {
		return "Payment service is down,try after some time";
	}
	
}
