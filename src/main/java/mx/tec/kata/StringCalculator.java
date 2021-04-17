package mx.tec.kata;

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
		int sum = 0;
		for (String stringNumbers: splitNumbers) {
			sum += Integer.parseInt(stringNumbers);
		}
	
		return sum;
	}
}
