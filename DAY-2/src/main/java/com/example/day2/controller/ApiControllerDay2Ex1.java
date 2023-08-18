package com.example.day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllerDay2Ex1 {
	@Value("${varname}")
	private String name;
	@GetMapping("/day2")
	public String display() {
		return name;
	}

}
