package com.javatechie;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("application started.........");
	}

	public static void main(String[] args) {
		logger.info("application executed......... ");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
