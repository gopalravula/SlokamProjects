package com.slokam.picgo.feign;

import org.springframework.stereotype.Component;

@Component
public class FallBack implements CustFeignClient{

	@Override
	public Integer getData() {
		System.out.println("asdfasdf");
		return 20;
	}

	
}
