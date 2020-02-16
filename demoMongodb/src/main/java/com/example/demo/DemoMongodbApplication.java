package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.SwaggerConfig.Bean;

@SpringBootApplication
public class DemoMongodbApplication {
	@Bean
	public static void main(String[] args) {
		SpringApplication.run(DemoMongodbApplication.class, args);
	}


}
