package com.slokam.rest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestApp2Application.class, args);
	}

}
