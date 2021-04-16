package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers) {
		
		if(numbers.isBlank()) {
			return 0;
		}
		
		String[] splitNumbers = numbers.split("\\n|,");
		int sum = 0;
		for (String stringNumbers: splitNumbers) {
			sum += Integer.parseInt(stringNumbers);
		}
	
		return sum;
	}
}
