package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class ApiService {
	@Autowired
	BookRepo sr;
	
	public Book saveinfo(Book ss) {
		return sr.save(ss);
	}
	public List<Book> savedetails(List<Book> ss){
		return (List<Book>)sr.saveAll(ss);
	}
	public List<Book> showinfo(){
		return sr.findAll();
	}
	//get by id
	public Optional<Book> showbyid(int id){
		return sr.findById(id);
	}
	
	public Book changeinfo(Book ss) {
		return sr.saveAndFlush(ss);
	}
	//update by id
	public String updateinfobyid(int id,Book ss) {
		sr.saveAndFlush(ss);
		if(sr.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteinfo(Book ss) {
		sr.delete(ss);
	}
	//delete by pathvariable
	public void deleteid(int id) {
		sr.deleteById(id);
	}
}
