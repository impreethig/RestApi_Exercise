package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>{
	@Query(value="select * from bike where year=:s",nativeQuery=true)
	public List<Bike>getbikeyearinfo(@Param("s")int year);
	
	@Query(value="select * from bike where year=:s or bike_name=:bk",nativeQuery=true)
	public List<Bike>getyearandbikenameinfo(@Param("s")int year,@Param("bk")String bikeName);
}
