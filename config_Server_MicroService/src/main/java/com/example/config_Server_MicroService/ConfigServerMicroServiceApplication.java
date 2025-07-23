package com.example.config_Server_MicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class ConfigServerMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMicroServiceApplication.class, args);
	}

}
