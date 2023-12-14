package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.slot;

@Repository
public interface slotRepository extends JpaRepository<slot, Integer> {
	
	@Query(value = "SELECT a1.id,a1.color,a1.registration_no,a1.slot,a1.ticket,a1.occupied,a1.parkinglotno from car_info a1 where a1.id=(select min(a2.id) from car_info a2 where a2.occupied=0) and a1.parkinglotno=:id", nativeQuery = true)
	public slot getslot(@Param("id") int id);
	
	@Query(value = "SELECT DISTINCT registration_no from car_info where color=:color", nativeQuery = true)
	public List<Integer> getRegNo(@Param("color") String color);
	
	@Query(value = "SELECT  ticket from car_info where registration_no=:regno", nativeQuery = true)
	public String getTicket(@Param("regno") Integer regno);
	
	@Query(value = "SELECT DISTINCT ticket from car_info where color=:color", nativeQuery = true)
	public List<String> getTicketsbasedoncolor(@Param("color") String color);

	@Query(value = "SELECT id from car_info where registration_no=:regno", nativeQuery = true)
	public Integer checkRegno(@Param("regno") Integer regno);
	
	

	
}
