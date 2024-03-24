package com.ms.product.ProductServiceMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.product.ProductServiceMS.Data.ProductData;
import com.ms.product.ProductServiceMS.Model.ProductModel;
import com.ms.product.ProductServiceMS.Repos.ProductRepoImpl;
import com.ms.product.ProductServiceMS.exception.ProductException;

import lombok.extern.log4j.Log4j;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepoImpl repo;
	
	@Override
	public Long addProduct(ProductData data) {
		ProductModel model = new ProductModel();
		model.setName(data.getName());
		model.setPrice(data.getPrice());
		repo.save(model);
		return model.getId();
	}
	
	public ProductData getProduct(String id) throws ProductException {
		ProductModel model =  repo.findById(Long.valueOf(id)).orElseThrow(() -> new ProductException("PRODUCT_NOT_FOUND","Product not found"));
		ProductData data = new ProductData();
		if(model!=null) {
			data.setId(model.getId());
			data.setName(model.getName());
			data.setPrice(model.getPrice());
		}
		return data;
	}
	
}
