package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting the application...");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("Application started successfully.");
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> System.out.println("Application running...");
	}

}
