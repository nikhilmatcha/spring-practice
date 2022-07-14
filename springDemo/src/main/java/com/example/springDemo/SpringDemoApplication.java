package com.example.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {
	@Value("${spring.application.name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	@RequestMapping(value="/")
	public String func(){
		return "Haii!! I am Nikhil Matcha. My employee id: 3410. The application name: " + name;	
	}

}
