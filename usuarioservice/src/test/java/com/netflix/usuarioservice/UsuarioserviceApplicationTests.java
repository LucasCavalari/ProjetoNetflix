package com.netflix.usuarioservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import com.netflix.register.RegisterApplication;

@SpringBootTest
class UsuarioserviceApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

	@Test
	void contextLoads() {
	}

}
