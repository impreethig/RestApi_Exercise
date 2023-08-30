package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService ser;
	
	@PostMapping("addemployee")
	public String add(@RequestBody Employee e)
	{
		 ser.saveinfo(e);
		 return "Data Saved";
	}
	@GetMapping("showemployeedetails")
	public List<Employee>show(){
		return ser.showinfo();
	}
	@PutMapping("updateemployee")
	public Employee modify(@RequestBody Employee ss)
	{
		return ser.changeinfo(ss);
	}
	@DeleteMapping("delemployeeid/{id}")
	public void deletemyid(@PathVariable int id) {
		ser.deleteid(id);
	}
	//using JPQL
		@GetMapping("showquery/{id}/{name}")
		public List<Employee>showdetails(@PathVariable int id,@PathVariable String name){
			return ser.getemp(id, name);
		}
		@DeleteMapping("deletequery/{id}")
		public String delstudetails(@PathVariable int id) {
			return ser.delemp(id)+" data deleted";
		}
		@PutMapping("updatequery/{newid}/{oldid}")
			public String updatestudetails(@PathVariable int newid,@PathVariable int oldid){
				return ser.updateemp(newid, oldid)+" data updated";
			}
		
		
}
