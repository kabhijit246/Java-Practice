package Assignment;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test1 {
	
	Main a;
	int value;
	@Before
	public void initializeTest1() {
		a = new Main();
		value = a.add(12, 4);
	}

	@Test
	public void testAddPositive() {
	    assertEquals(16, value);
	}
	
	@Test
	public void testAddNegative() {
		assertNotEquals(12, value);
	}
	
	@Test
	public void testAddFail() {
		assertEquals(14, value);
	}
}
