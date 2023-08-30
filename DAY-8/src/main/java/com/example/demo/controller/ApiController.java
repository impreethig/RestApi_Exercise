package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@RestController
public class ApiController {
	@Autowired
	BikeRepo cr;
	@PostMapping("addbike")
	public Bike add(@RequestBody Bike c)
	{
		return cr.save(c);
	}
	
	@GetMapping("year/{y}")
	public List<Bike>getbikeyear(@PathVariable int y){
		return cr.getbikeyearinfo(y);
	}
	@GetMapping("year/{y}/bikeName/{bk}")
	public List<Bike>getyearandbikename(@PathVariable int y,@PathVariable String bk){
		return cr.getyearandbikenameinfo(y, bk);
	}

}
