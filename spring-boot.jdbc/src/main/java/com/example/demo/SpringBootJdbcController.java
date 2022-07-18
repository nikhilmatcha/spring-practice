package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email)values('Nikhil Matcha','nikhil.matcha@techmojo.in')");
		return "data inserted successfully";
	}

}
