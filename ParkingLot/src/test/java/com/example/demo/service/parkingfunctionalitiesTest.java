package com.example.demo.service;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;

import com.example.demo.entity.ParkingSlot;
import com.example.demo.entity.slot;
import com.example.demo.repository.ParkingLotRepository;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@SpringBootTest
public class parkingfunctionalitiesTest {

	
//	@Mock
//	private ParkingSlot parkinglot;
	
	@Mock
	private ParkingLotRepository parkinglotrepo;
	
	@InjectMocks
    private ParkingFunctionalities parkingService;
	

	
	@Test
	public void createParkingLotTest() {
		
	    ParkingSlot parking = new ParkingSlot();
	   
	    Mockito.when(parkinglotrepo.save(Mockito.any(ParkingSlot.class))).thenReturn(parking);

		String response = parkingService.create(2);
		String expected="Success";
		assertEquals(expected,response);
	}
	
	@Test
	public void parkVehicleTest()  {

		
		Integer registration_no=123;
		String color="GREEN";
		String response = parkingService.park(registration_no, color);
		assertEquals("parked successfully", response);
	}

	
}