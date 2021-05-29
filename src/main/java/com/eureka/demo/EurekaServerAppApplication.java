package com.eureka.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAppApplication {
	
	private static Logger logger = LoggerFactory.getLogger(EurekaServerAppApplication.class);


	public static void main(String[] args) {
		
        System.setProperty("server.connection-timeout","120000");
        
		SpringApplication.run(EurekaServerAppApplication.class, args);
		logger.info("EUREKA SERVER STARTED...");
	}

}
