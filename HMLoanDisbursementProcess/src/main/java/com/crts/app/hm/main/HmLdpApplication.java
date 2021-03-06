package com.crts.app.hm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class HmLdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmLdpApplication.class, args);
		System.out.println("cliect ready");
	}
	@LoadBalanced
	@Bean
	public RestTemplate rs() 
	{
		RestTemplate ret=new RestTemplate();
		return ret;
		
		
	}

}
