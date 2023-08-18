package com.example.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex1 {

	@GetMapping("ex1")
	public String Welcome()
	{
		return "Welcome Spring Boot!";
	}
}
