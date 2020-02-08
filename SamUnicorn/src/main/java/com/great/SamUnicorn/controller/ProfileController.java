package com.great.SamUnicorn.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class ProfileController {
	
	private String driverName;
	
	private String url;
	
	private String userName;
	
	private String password;
	
	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("dev url");
		System.out.println("userName");
		System.out.println("password");
		return "Db-Connection for dev";
		
	}
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("dev url");
		System.out.println("userName");
		System.out.println("password");
		return "Db-Connection for prod";
		
	}
}
