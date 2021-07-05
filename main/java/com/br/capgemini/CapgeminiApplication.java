package com.br.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.capgemini")
public class CapgeminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapgeminiApplication.class, args);
	}

}
