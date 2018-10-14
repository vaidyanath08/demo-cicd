package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoCicdAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCicdAppApplication.class, args);
		System.Out.Println("Hello World!!");
	}
}
