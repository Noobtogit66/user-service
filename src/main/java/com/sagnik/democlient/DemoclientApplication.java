package com.sagnik.democlient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoclientApplication.class, args);
	}

}
