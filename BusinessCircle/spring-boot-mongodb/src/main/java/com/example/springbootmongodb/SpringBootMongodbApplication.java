package com.example.springbootmongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongodbApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8081");
		SpringApplication.run(SpringBootMongodbApplication.class, args);
	}

}
