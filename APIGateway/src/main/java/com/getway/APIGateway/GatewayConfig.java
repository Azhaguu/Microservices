package com.getway.APIGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
	    return builder.routes()
	        .route(order -> order.path("/OrderServiceMS/**").uri("lb://OrderServiceMS"))
	        .route(order -> order.path("/ProductServiceMS/**").uri("lb://ProductServiceMS"))
	    	.route(order -> order.path("/PaymentServiceMS/**").uri("lb://PaymentServiceMS"))
	    	.build();
	}
}
