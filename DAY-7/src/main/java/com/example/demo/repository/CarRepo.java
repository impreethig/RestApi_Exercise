package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;
@Repository
public interface CarRepo extends JpaRepository<Car, Integer>{

	@Query(value="select * from cartable where owners=:o",nativeQuery = true)
	public List<Car>getownerInfo(@Param("o")int owners);
	
	@Query(value="select * from cartable where address=:a",nativeQuery = true)
	public List<Car>getaddressInfo(@Param("a")String address);
	
	@Query(value="select * from cartable where car_name=:cn",nativeQuery = true)
	public List<Car>getcarnameInfo(@Param("cn")String carName);
	
	@Query(value="select * from cartable where owners=:o or car_type=:ct ",nativeQuery = true)
	public List<Car>getownerandcartypeInfo(@Param("o")int owners,@Param("ct")String carType);
}
