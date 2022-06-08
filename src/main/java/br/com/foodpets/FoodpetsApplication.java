package br.com.foodpets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.foodpets")
public class FoodpetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodpetsApplication.class, args);
	}

}
