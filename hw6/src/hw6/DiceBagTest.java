package hw6;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DiceBagTest {
	
	Token tk =new Token("steve");
	
	DiceBag bag = Mockito.mock(DiceBag.class);
	
	@Before
	void setUp() throws Exception {
		//bag =  new DiceBag();
	}

	@After
	void tearDown() throws Exception {
		bag=null;
	}

	@Test
	void testAddToken() {
		when(bag.addToken(tk)).thenReturn(1);
		assertEquals(bag.addToken(tk),1);	
	}

	@Test
	void testDrawToken() {
		when(bag.drawToken()).thenReturn(null);
		assertEquals(bag.drawToken(),null);
		
	}
}
