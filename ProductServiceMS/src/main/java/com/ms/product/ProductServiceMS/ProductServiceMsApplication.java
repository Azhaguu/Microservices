package com.ms.product.ProductServiceMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.ms.product.ProductServiceMS.controller.ProductController;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceMsApplication.class, args);
	}

}
