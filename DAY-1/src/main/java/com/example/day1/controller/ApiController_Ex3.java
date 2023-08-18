package com.example.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex3 {
	@Value("${color}")
	private String color;
	@GetMapping("ex3")
	public String getMyFav() {
		return "My Favourite Color is "+color;
	}

}
