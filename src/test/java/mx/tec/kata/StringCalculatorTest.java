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
	
	@Test
	void testGivenCalculator_whenAdd1newline2comma3then6() {
		int expectedResult = 6;
		String numbers = "1\n2,3";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void test_givenCalculator_whenSlashSlashSemicolonNewline1Semicolon2_then3() {
		int expectedResult = 3;
		String numbers = "//;\n1;2";
		
		int actualResult = calc.add(numbers);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testGivenCalculator_whenAdd1commaminus3comma5commaminus7comma9_thenException() {
		String expectedResult = "negatives not allowed: -3, -7";
		String numbers = "1,-3,5,-7,9";
		
		
		try {
			calc.add(numbers);
			fail("Exception Not Thrown");
		} catch (UnsupportedOperationException e) {
			assertEquals(expectedResult, e.getMessage());
		}
	}
	

}
