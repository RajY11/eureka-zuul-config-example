package com.javapath.userdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDbServiceApplication.class, args);
	}

}
