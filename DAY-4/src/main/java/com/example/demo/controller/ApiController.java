package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;




@RestController
public class ApiController {

	@Autowired
	ApiService sser;
	
	@PostMapping("addstudent")
	public Student add(@RequestBody Student ss)
	{
		return sser.saveInfo(ss);
	}
	@GetMapping("showdetails")
	public List<Student>show(){
		return sser.showInfo();
		}
	@PutMapping("update")
	public Student modify(@RequestBody Student ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletedetail")
	public String del(@RequestBody Student ss)
	{
		sser.deleteinfo(ss);
		return "Deleted Successfully";
	}
}
