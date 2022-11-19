package com.netflix.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableRabbit
public class projetoapplication {

	public static void main(String[] args) {
		SpringApplication.run(projetoapplication.class, args);
	}

}
