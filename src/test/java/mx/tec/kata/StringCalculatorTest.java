package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator calc = new StringCalculator();
	
	@Test 
	void testGivenCalculator_whenAddEmptyString_thenReturnZero() {
		int expectedResult = 0;
		String numbers = "";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test 
	void testGivenCalculator_whenAdd1_then1() {
		int expectedResult = 1;
		String numbers = "1";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test 
	void testGivenCalculator_whenAdd1Comma2_then3() {
		int expectedResult = 3;
		String numbers = "1,2";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test 
	void testGivenCalculator_whenAdd1_3_5_7_8_then25() {
		int expectedResult = 25;
		String numbers = "1,3,5,7,9";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	

}
