package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcateTest {

	@Test
	public void testConcatenate() {
		Junit  test = new Junit();
		String result = test.Concatenate("one", "two");
		assertEquals("onetwo", result);	
		
	}
	
	

}
