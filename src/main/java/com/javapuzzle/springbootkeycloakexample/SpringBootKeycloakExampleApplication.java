package com.javapuzzle.springbootkeycloakexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;

@LiquibaseDataSource
@SpringBootApplication
public class SpringBootKeycloakExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKeycloakExampleApplication.class, args);
	}

}
