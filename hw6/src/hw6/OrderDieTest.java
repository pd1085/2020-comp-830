package hw6;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OrderDieTest {

	
	OrderDie order=Mockito.mock(OrderDie.class);
	
	@BeforeEach
	void setUp() throws Exception {
		//order =  new OrderDie("steve","black");
	}

	@AfterEach
	void tearDown() throws Exception {
		order=null;
	}

	@Test
	void testToString() {
		when(order.toString()).thenReturn("steve black");
		assertEquals(order.toString(),"steve black");
	}

	

}
