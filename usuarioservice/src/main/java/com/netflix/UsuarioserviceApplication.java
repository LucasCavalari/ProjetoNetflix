package com.netflix;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class UsuarioserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioserviceApplication.class, args);
	}

}







