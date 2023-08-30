package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	private int empid;
	private String empname;
	private String empservice;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_order_id")
	private Order od;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empname, String empservice, Order od) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empservice = empservice;
		this.od = od;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpservice() {
		return empservice;
	}

	public void setEmpservice(String empservice) {
		this.empservice = empservice;
	}

	public Order getOd() {
		return od;
	}

	public void setOd(Order od) {
		this.od = od;
	}
	
	
	
}
