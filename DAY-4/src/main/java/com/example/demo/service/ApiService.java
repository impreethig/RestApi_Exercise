package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;


@Service
public class ApiService {
	
	@Autowired
	StudentRepo sr;
	
	public Student saveInfo(Student ss) {
		return sr.save(ss);
	}
	public List<Student> showInfo(){
		return sr.findAll();
	}
	public Student changeinfo(Student ss) {
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(Student ss) {
		sr.delete(ss);
	}
}
