package Assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {


	@Test
	public void testSum() {
		int sumTest = Calculator.sum(6, 4);
		assertEquals(10,sumTest);
		
	}

	@Test
	public void testSubtract() {
		int subtractTest = Calculator.subtract(6, 4);
		assertEquals(2,subtractTest);
		
	}

	@Test
	public void testMultiplication() {
		
	int multiplicationTest = Calculator.multiplication(6, 4);
	assertEquals(24,multiplicationTest);
	}

	@Test
	public void testDivision() {
		
		int divisionTest = Calculator.division(8, 4);
		assertEquals(2,divisionTest);
	}

}
