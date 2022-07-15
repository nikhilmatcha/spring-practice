package com.example.server.main;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path="/hello-world/path-variable/{name}")  
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {  
		return new HelloWorldBean(String.format("Hello World, %s", name)); //%s replace the name  
	}
	
}
