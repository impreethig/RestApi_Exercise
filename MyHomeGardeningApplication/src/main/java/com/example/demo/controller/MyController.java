package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.GardenEntity;
import com.example.demo.service.MyService;



@RestController
public class MyController {
	
	@Autowired
	MyService ser;
	@PostMapping("addplant")
	public GardenEntity add(@RequestBody GardenEntity e) {
		return ser.saveinfo(e);
	}
	@PostMapping("addnplants")
	public List<GardenEntity> addndetails(@RequestBody List<GardenEntity> ss)
	{
		return ser.savedetails(ss);
	}
	@GetMapping("showdetails")
	public List<GardenEntity>show(){
		return ser.showinfo();
	}
	@GetMapping("showdetbyid/{id}")
	public Optional<GardenEntity>showid(@PathVariable int id){
		return ser.showbyid(id);
	}
	@PutMapping("update")
	public GardenEntity modify(@RequestBody GardenEntity ss)
	{
		return ser.changeinfo(ss);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody GardenEntity ss) {
		
		return ser.updateinfobyid(id,ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody GardenEntity ss)
	{
		ser.deleteinfo(ss);
		return "Deleted Successfully";
	}
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		ser.deleteid(id);
	}
}
