package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void PositiveCase() {
		JunitTesting test = new JunitTesting();
		double output= test.divide(10,5);
		assertEquals(2,output);
		
		
	}
	
	@Test
	void NegativeCase() {
		JunitTesting test = new JunitTesting();
		double output= test.divide(10,2);
		assertEquals(5,output);
		
		
	}

}
