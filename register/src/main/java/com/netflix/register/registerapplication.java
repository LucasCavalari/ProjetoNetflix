package com.netflix.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class registerapplication {

	public static void main(String[] args) {
		SpringApplication.run(registerapplication.class, args);
	}

}
