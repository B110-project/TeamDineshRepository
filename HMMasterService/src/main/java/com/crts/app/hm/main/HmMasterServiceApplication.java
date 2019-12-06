package com.crts.app.hm.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
@EnableDiscoveryClient
@SpringBootApplication
public class HmMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmMasterServiceApplication.class, args);
		System.out.println("HMMASTER STARTED");
	}

	@Bean
	public Logger logger() {
		Logger logger=LogManager.getLogger();
		return logger;
	}
}
