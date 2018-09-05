package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	public void Multest() {
		Junit  test = new Junit();
		int result = test.Multiply(3, 4);
		assertEquals(12, result);	
	}

}
