package com.slokam.picgo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.slokam.picgo.feign.CustFeignClient;

@RestController
public class CommunicationController {

	@Autowired
	private RestTemplate template  ;
	
	@Autowired
	private CustFeignClient custRest;
	
	@GetMapping("getData")
	public String getData() {
		
		Integer data = custRest.getData();
		return "Get Data from PicOGo version 2::"+data;
		
		/*
		 * Integer data = template.getForObject("http://cust/getData", Integer.class);
		 * return "Get Data from PicOGo::"+data;
		 */
	}

	
}
