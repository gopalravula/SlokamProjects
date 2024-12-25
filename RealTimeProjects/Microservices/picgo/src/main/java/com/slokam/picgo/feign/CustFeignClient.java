package com.slokam.picgo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.slokam.picgo.entity.Cust;

@FeignClient(name="demo", fallback = FallBack.class)
public interface CustFeignClient {

	@GetMapping("getData")
	public Integer getData();
	// restTemplate.getForEntity("demo://getData",)
	
	
	
}
