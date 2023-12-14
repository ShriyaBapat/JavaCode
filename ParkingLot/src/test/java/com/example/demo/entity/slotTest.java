package com.example.demo.entity;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.slot;
import com.example.demo.repository.slotRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class slotTest {
	
	 	@Mock
	    private slotRepository slotrepo;

	    @InjectMocks
	    private slot entity;
	    
	    @Test
		public void testGettersAndSetters() {
			Integer id = 1;
			Integer registration_no = 123;
			String color = "RED";
			Boolean occupied=true;
			String ticket="1P123";
			Integer parkinglotno=1;
			

			entity.setId(id);
			entity.setColor(color);
			entity.setOccupied(occupied);
			entity.setParkinglotno(parkinglotno);
			entity.setRegistration_no(registration_no);
			entity.setTicket(ticket);

			assertEquals(id, entity.getId());
			assertEquals(color, entity.getColor());
			assertEquals(occupied, entity.isOccupied());
			assertEquals(registration_no, entity.getRegistration_no());
			assertEquals(ticket, entity.getTicket());
			assertEquals(parkinglotno, entity.getParkinglotno());
		}
	    
	    @Test
	    public void testSave() {
	        when(slotrepo.save(entity)).thenReturn(entity);

	        slot savedEntity = slotrepo.save(entity);

	        assertEquals(entity, savedEntity);
	        verify(slotrepo, times(1)).save(entity);
	    }

}
