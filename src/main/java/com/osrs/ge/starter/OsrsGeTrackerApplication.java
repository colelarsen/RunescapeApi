package com.osrs.ge.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.osrs.ge.client"})
@ComponentScan({"com.osrs.ge.client", "com.osrs.ge.rest"})
public class OsrsGeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsrsGeTrackerApplication.class, args);
		
	}

}
