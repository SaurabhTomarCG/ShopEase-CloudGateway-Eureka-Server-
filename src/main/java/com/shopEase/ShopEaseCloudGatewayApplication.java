package com.shopEase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ShopEaseCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEaseCloudGatewayApplication.class, args);
	}

}
