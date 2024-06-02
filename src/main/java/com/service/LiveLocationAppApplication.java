package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"com.service", "com.liveLocation.controller"})
public class LiveLocationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveLocationAppApplication.class, args);
	}

}
