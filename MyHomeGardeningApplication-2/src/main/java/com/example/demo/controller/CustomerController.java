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
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService ser;
	
	@PostMapping("addcustomer")
	public String add(@RequestBody Customer e)
	{
		 ser.saveinfo(e);
		 return "Data Saved";
	}
	@GetMapping("showcustomerdetails")
	public List<Customer>show(){
		return ser.showinfo();
	}
	@PutMapping("updatecustomer")
	public Customer modify(@RequestBody Customer ss)
	{
		return ser.changeinfo(ss);
	}
	@DeleteMapping("delcustomerid/{id}")
	public void deletemyid(@PathVariable int id) {
		ser.deleteid(id);
	}
	//SORTING
		@GetMapping("sort/{name}")
		public List<Customer> getsortinfo(@PathVariable String name){
			return ser.sortinfo(name);
		}
		
		//PAGING
		@GetMapping("paging/{pageno}/{pagesize}")
		public List<Customer>showpageinfo(@PathVariable int pageno,@PathVariable int pagesize){
			return ser.getbypage(pageno, pagesize);
		}
		//PAGING&SORTING
		@GetMapping("pagingandsorting/{pageno}/{pagesize}/{name}")
		public List<Customer>showpageinfosorted(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
			return ser.getbypagesorted(pageno, pagesize,name);
		}
}
