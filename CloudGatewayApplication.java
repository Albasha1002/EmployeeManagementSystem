package com.management.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@SpringBootApplication
@EnableDiscoveryClient
@CircuitBreaker(name = "", fallbackMethod="")
public class CloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayApplication.class, args);
	}
	
	

}
