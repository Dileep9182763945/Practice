package com.advintek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootProj01BillingService1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProj01BillingService1Application.class, args);
	}

}
