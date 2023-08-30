package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Child;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
	@Autowired
	ApiService ser;
	@PostMapping("addchild")
	public Child add(@RequestBody Child ss)
	{
		return ser.saveinfo(ss);
	}
	
	//SORTING
		@GetMapping("sort/{name}")
		public List<Child> getsortinfo(@PathVariable String name){
			return ser.sortinfo(name);
		}
		
		//PAGING
		@GetMapping("paging/{pageno}/{pagesize}")
		public List<Child>showpageinfo(@PathVariable int pageno,@PathVariable int pagesize){
			return ser.getbypage(pageno, pagesize);
		}
		//PAGING&SORTING
		@GetMapping("pagingandsorting/{pageno}/{pagesize}/{name}")
		public List<Child>showpageinfosorted(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String name){
			return ser.getbypagesorted(pageno, pagesize,name);
		}
}
