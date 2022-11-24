package com.netflix;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class usuarioserviceapplication {

	public static void main(String[] args) {
		SpringApplication.run(usuarioserviceapplication.class, args);
	}

}







