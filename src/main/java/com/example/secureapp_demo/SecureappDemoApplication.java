package com.example.secureapp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
public class SecureappDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureappDemoApplication.class, args);
		
		System.out.println("hello world...");
	}

}
