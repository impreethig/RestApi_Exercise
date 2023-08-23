package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.GardenEntity;
import com.example.demo.repository.MyRepo;


@Service
public class MyService {
	@Autowired
	MyRepo mr;
	
	public GardenEntity saveinfo(GardenEntity e) {
		return mr.save(e);
	}
	public List<GardenEntity> savedetails(List<GardenEntity> ss){
		return (List<GardenEntity>)mr.saveAll(ss);
	}
	public List<GardenEntity>showinfo(){
		return mr.findAll();
	}
	public Optional<GardenEntity> showbyid(int id){
		return mr.findById(id);
	}
	
	public GardenEntity changeinfo(GardenEntity ss) {
		return mr.saveAndFlush(ss);
	}
	//update by id
	public String updateinfobyid(int id,GardenEntity ss) {
		mr.saveAndFlush(ss);
		if(mr.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}
	public void deleteinfo(GardenEntity ss) {
		mr.delete(ss);
	}
	//delete by pathvariable
	public void deleteid(int id) {
		mr.deleteById(id);
	}

}
