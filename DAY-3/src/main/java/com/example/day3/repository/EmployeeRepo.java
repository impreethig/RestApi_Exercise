package com.example.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day3.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
