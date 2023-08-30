package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepo;

@RestController
public class ApiController {
	@Autowired
	CarRepo cr;
	
	@PostMapping("addcar")
	public Car add(@RequestBody Car c)
	{
		return cr.save(c);
	}
	@GetMapping("owners/{o}")
	public List<Car>getowner(@PathVariable int o){
		return cr.getownerInfo(o);
	}
	@GetMapping("address/{a}")
	public List<Car>getaddress(@PathVariable String a){
		return cr.getaddressInfo(a);
	}
	@GetMapping("carname/{cn}")
	public List<Car>getcarname(@PathVariable String cn){
		return cr.getcarnameInfo(cn);
	}
	@GetMapping("owners/{o}/cartype/{ct}")
	public List<Car>getownerandcartypeInfo(@PathVariable int o,@PathVariable String ct){
		return cr.getownerandcartypeInfo(o, ct);
	}
}
