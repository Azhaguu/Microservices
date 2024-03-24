package com.ms.product.ProductServiceMS.Service;

import com.ms.product.ProductServiceMS.Data.ProductData;
import com.ms.product.ProductServiceMS.Model.ProductModel;
import com.ms.product.ProductServiceMS.exception.ProductException;

public interface ProductService {
	Long addProduct(ProductData data);
	ProductData getProduct(String id) throws ProductException;
}
