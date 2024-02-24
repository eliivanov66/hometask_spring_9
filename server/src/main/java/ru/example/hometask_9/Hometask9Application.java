package ru.example.hometask_9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Hometask9Application {
	public static void main(String[] args) {
		SpringApplication.run(Hometask9Application.class, args);
	}
}
