package com.slokam.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1Controller {

	@GetMapping("custreg")
	public String test() {
		System.out.println("I am here.");
		return "This is from Rest one Application";
	}
	
	@GetMapping("getData")
	public Integer getData() {
		System.out.println("I am here in called by feign client.");
		return 5555;
	}
}
