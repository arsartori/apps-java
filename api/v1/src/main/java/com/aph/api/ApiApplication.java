package com.aph.api;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
