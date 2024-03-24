package com.ms.product.ProductServiceMS.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value=ProductException.class)
	public ResponseEntity<ErrorResponse> handleProductException(ProductException productException){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(productException.getCode());
		errorResponse.setMessage(productException.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}

}
