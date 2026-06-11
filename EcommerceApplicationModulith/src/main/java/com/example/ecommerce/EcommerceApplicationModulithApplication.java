package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplicationModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplicationModulithApplication.class, args);
	}

}

//  POST http://localhost:8080/orders?product=Laptop&quantity=1  (for testing)

// http://localhost:8080/orders/place?product=Laptop&quantity=5 (testing with GET root)

// http://localhost:8080/h2-console  