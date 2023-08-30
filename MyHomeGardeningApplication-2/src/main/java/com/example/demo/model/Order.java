package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertable")
public class Order {
	@Id
	private int orderid;
	private String servicename;
	private String category;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderid, String servicename, String category) {
		super();
		this.orderid = orderid;
		this.servicename = servicename;
		this.category = category;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
