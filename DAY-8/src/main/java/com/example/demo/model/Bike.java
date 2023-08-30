package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike")
public class Bike {
	@Id
	private int bikeid;
	private String regNumber;
	private String ownerName;
	private int year;
	private String bikeName;
	private String modelName;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bikeid, String regNumber, String ownerName, int year, String bikeName, String modelName) {
		super();
		this.bikeid = bikeid;
		this.regNumber = regNumber;
		this.ownerName = ownerName;
		this.year = year;
		this.bikeName = bikeName;
		this.modelName = modelName;
	}
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

}
