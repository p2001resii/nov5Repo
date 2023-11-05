package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


/*
 *The @EnableConfigServer annotation makes your Spring Boot application act as a Configuration Server.
 * Configuration Server runs on the Tomcat port 8080 and application configuration properties are
 *  loaded from native search locations. 
 * 
 * */
 