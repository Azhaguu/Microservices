package com.ms.Order.OrderServiceMS.errordecoder;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.Order.OrderServiceMS.customException.ErrorResponse;
import com.ms.Order.OrderServiceMS.customException.OrderException;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ErrorConfigDecoder implements ErrorDecoder{

	@Override
	public Exception decode(String methodKey, Response response) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			ErrorResponse errorResponse = mapper.readValue(response.body().asInputStream(), ErrorResponse.class);
			return new OrderException(errorResponse.getCode(), errorResponse.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new OrderException("Internal Service Error", "INTERNAL_SERVICE_ERROR");
	}

}
