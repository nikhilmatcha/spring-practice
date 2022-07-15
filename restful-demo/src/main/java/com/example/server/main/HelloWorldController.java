package com.example.server.main;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String hello() {
		return "Hello World!!!";
	}
	
	@GetMapping(path="/bean")
	public HelloWorldBean helloBean() {
		return  new HelloWorldBean("Hello World.");
	}
	
}
