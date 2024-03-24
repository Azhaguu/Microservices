package com.ms.Order.OrderServiceMS.errordecoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //to make it availalbe for scan
public class DecodeConfig {

	@Bean //to make this as a bean
	public ErrorConfigDecoder createConfig() {
		return new ErrorConfigDecoder();
	}
	
}
