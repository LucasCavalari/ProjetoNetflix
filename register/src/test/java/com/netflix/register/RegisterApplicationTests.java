package com.netflix.register;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import com.netflix.register.RegisterApplication;

@SpringBootTest
class RegisterApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

}
