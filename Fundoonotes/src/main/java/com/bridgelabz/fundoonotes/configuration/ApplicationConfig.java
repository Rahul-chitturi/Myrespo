package com.bridgelabz.fundoonotes.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bridgelabz.fundoonotes.model.User;

@Configuration
public class ApplicationConfig {

	@Bean
	public User getUser() {
		return new User();
	}
}
