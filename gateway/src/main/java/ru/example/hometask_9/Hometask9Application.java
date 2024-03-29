package ru.example.hometask_9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Hometask9Application {
	public static void main(String[] args) {
		SpringApplication.run(Hometask9Application.class, args);
	}
}
