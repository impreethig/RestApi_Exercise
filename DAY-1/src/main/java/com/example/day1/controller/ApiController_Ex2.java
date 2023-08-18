package com.example.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex2 {
	@Value("${name}")
	private String name;
	@GetMapping("ex2")
	public String getName() {
		return "Welcome "+name+" !";
	}
}
