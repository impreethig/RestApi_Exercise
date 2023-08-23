package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.GardenEntity;

public interface MyRepo extends JpaRepository<GardenEntity, Integer> {

}
