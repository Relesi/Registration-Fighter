 package com.relesi.fighterregistration.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class FighterRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FighterRegistrationApplication.class, args);
	}
}
