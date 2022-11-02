package src.test.java.com.netflix.veiculoservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import src.main.java.com.netflix.register.RegisterApplication;

@SpringBootTest
class UsuarioserviceApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(RegisterApplication.class, args);
	}

	@Test
	void contextLoads() {
	}

}
