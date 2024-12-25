package com.slokam.picgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@EnableResourceServer
@EnableFeignClients
//@EnableOAuth2Sso
public class PicgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicgoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate(); 
	}
	
	
	/*
	 * public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
	 * restTemplateBuilder.basicAuthentication("slokamTech", "tech").build(); return
	 * restTemplateBuilder.build(); }
	 */
	
}
