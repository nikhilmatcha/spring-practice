package com.example.springDemoApplicationRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ApplicationArguments;

@SpringBootApplication
public class SpringDemoApplicationRunnerApplication implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplicationRunnerApplication.class, args);
	}
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Application Runner welcomes you");
	}

}
