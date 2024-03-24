package com.ms.Order.OrderServiceMS.customException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(OrderException.class)
	public ResponseEntity<ErrorResponse> handleOrderException(OrderException err){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setCode(err.getCode());
		errorResponse.setMessage(err.getMessage());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
}
