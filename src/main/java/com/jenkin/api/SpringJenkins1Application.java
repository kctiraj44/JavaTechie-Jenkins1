package com.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkins1Application {

	
	public static  Logger logger = LoggerFactory.getLogger(SpringJenkins1Application.class);
	
	@PostConstruct
	public void inititt() {
		logger.info("*---------------Application Started---------*");
	}
	
	public static void main(String[] args) {
		logger.info("*---------------Application Executed---------*");

		SpringApplication.run(SpringJenkins1Application.class, args);
	}

}
