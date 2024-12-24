package com.slokam.rest2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("vecheck")
	public String test() {
		return "This is from Rest two Application";
	}
}
