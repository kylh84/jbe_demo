package edu.r2s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.print("Welcome to Spring boot");
		System.out.print("Hello World");
		SpringApplication.run(DemoApplication.class, args);
	}

}
