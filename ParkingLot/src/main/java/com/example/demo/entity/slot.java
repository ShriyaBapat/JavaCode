package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car_info")
public class slot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "registration_no")
	private int registration_no;
	
	@Column(name = "color")
	private String color;
	
	@Column(name="parkinglotno")
	private int parkinglotno;
	
	@Column(name="ticket")
	private String ticket;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(int registration_no) {
		this.registration_no = registration_no;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getParkinglotno() {
		return parkinglotno;
	}

	public void setParkinglotno(int parkinglotno) {
		this.parkinglotno = parkinglotno;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String string) {
		this.ticket = string;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	@Column(name="occupied")
	private boolean occupied;
	


	

}
