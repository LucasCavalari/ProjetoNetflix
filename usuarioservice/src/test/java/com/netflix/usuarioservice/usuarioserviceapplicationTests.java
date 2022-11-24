package com.netflix.usuarioservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import com.netflix.register.registerapplication;

@SpringBootTest
class usuarioserviceapplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(registerapplication.class, args);
	}

	@Test
	void contextLoads() {
	}

}
