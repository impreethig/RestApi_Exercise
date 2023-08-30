package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	private int custid;
	private String custname;
	private long mobileno;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="customerid")
	private List<Order> o;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custid, String custname, long mobileno, List<Order> o) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.mobileno = mobileno;
		//this.o = o;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public List<Order> getO() {
		return o;
	}

	public void setO(List<Order> o) {
		this.o = o;
	}
	
	
}
