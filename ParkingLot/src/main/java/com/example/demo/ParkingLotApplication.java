package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(ParkingLotApplication.class);
		//SpringApplication.run(ParkingLotApplication.class, args);
		application.setAddCommandLineProperties(false);
		application.run(args);
		
		
	}

}
