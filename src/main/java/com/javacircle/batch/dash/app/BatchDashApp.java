package com.javacircle.batch.dash.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.javacircle")
public class BatchDashApp {

	public static void main(String[] args) {
		SpringApplication.run(BatchDashApp.class, args);
	}

}

