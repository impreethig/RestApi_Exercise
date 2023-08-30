package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepo;


@Service
public class CustomerService {
	@Autowired
	CustomerRepo cr;
	
	public Customer saveinfo(Customer e) {
		return cr.save(e);
	}
	public List<Customer> showinfo(){
		return cr.findAll();
	}
	public Customer changeinfo(Customer ss) {
		return cr.saveAndFlush(ss);
	}
	public void deleteid(int id) {
		cr.deleteById(id);
	}
	//sorting
		public List<Customer>sortinfo(String s ){
			return cr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
		}
		
		//sorting in descending order
		/*public List<StudentEntity>sortinfo(String s ){
			return sr.findAll(Sort.by(Sort.Direction.DESC,s));
		}
		*/
		//Paging//getting specific page
		public List<Customer> getbypage(int pgno,int pgsize){
			Page<Customer> p=cr.findAll(PageRequest.of(pgno,pgsize));
			return p.getContent();
		}
		public List<Customer> getbypagesorted(int pgno,int pgsize,String s){
			Page<Customer> p=cr.findAll(PageRequest.of(pgno, pgsize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
			return p.getContent();
		}
}
