package Assignment;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Test2 {
	
    Main s;
	int value;
	@Before
	public void initializeTest2() {
		s = new Main();
		value = s.subtract(12, 4);
	}

	@Test
	public void testSubtractPositive() {
	    assertEquals(8, value);
	}
	
	@Test
	public void testSubtractNegative() {
		assertNotEquals(6, value);
	}
	
	@Test
	public void testSubtractFail() {
		assertEquals(10, value);
	}
}
