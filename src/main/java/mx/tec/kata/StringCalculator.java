package mx.tec.kata;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
	public int add(String numbers) {
		
		String delimiter = ",";
		if(numbers.isBlank()) {
			return 0;
		}
		
		if(numbers.startsWith("//")) {
			delimiter = numbers.substring(2,3);
			numbers = numbers.substring(4);
		}
		
		String[] splitNumbers = numbers.split("\\n|" + delimiter);
		List<Integer> negNumbers = new ArrayList<>();
		int sum = 0;
		for (String stringNumbers: splitNumbers) {
			int number = Integer.parseInt(stringNumbers);
			if(number < 0) {
				negNumbers.add(number);
			}
			sum += number;
		}
		if(!negNumbers.isEmpty()) {
			String negNumbersList = negNumbers.toString().substring(1, negNumbers.toString().length() -1);
			throw new UnsupportedOperationException("negatives not allowed: " + negNumbersList);
		}
	
		return sum;
	}
}
