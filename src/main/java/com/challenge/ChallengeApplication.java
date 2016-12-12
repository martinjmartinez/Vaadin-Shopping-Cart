package com.challenge;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		SpringApplication.run(ChallengeApplication.class, args);


	}
}
