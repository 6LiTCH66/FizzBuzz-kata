package ee.tthk.tarpv19.iljaHolmogortsev;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
	int[] numbers;
	
	public String[] getNumbers() {
		numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		
		return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
	}
	
	
	public String getFizzBuzz(int number) {
		if((number % 3) == 0) {
			return "Fizz";
		}
		else if((number % 5) == 0) {
			return "Buzz";
		}
		else if((number % 15) == 0) {
			return "FizzBuzz";
		}
		
		return String.valueOf(number);
	}

}