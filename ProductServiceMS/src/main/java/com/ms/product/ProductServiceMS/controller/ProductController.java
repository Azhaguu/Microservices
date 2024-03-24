package com.ms.product.ProductServiceMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.product.ProductServiceMS.Data.ProductData;
import com.ms.product.ProductServiceMS.Service.ProductService;
import com.ms.product.ProductServiceMS.Service.ProductServiceImpl;
import com.ms.product.ProductServiceMS.exception.ProductException;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService ps;
	
	@PostMapping(value = "/add",consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Long> addProduct(@RequestBody ProductData product) {
		System.out.println("line 22"+product.getName()+","+product.getPrice());
		Long id = ps.addProduct(product);
		return ResponseEntity.ok(id);
	}
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public Long getProduct(@PathVariable String id) throws ProductException {
		System.out.println("line 39"+id);
		ProductData product = ps.getProduct(id);
		return product.getId();
	}
	
	
}
