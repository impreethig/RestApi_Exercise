package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee e) {
		return er.save(e);
	}
	public List<Employee> showinfo(){
		return er.findAll();
	}
	public Employee changeinfo(Employee ss) {
		return er.saveAndFlush(ss);
	}
	public void deleteid(int id) {
		er.deleteById(id);
	}
	
	//using JPQL
		public List<Employee> getemp(int i,String s){
			return er.getEmployeeInfo(i, s);
			
		}
		public int delemp(int id) {
			return er.deleteEmployeeInfo(id);
		}
		public int updateemp(int id,int idl) {
			return er.updateEmployeeInfo(id, idl);
		}
		
		
	

}
