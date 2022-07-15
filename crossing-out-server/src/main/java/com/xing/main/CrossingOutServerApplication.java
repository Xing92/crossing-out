package com.xing.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrossingOutServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossingOutServerApplication.class, args);
		System.out.println("Xing:started");
	}
}
