package ee.tthk.tarpv19.iljaHolmogortsev;

import java.util.ArrayList;

public class FizzBuzz {
	int[] numbers;
	public int[] getNumbers() {
		numbers = new int[100];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		
		return numbers;
	}
	
	
	public String getFizz() {
		String result = "";
		for (Integer num: getNumbers().subList(0, 20) ) {
			if ((num % 3) == 0) {
				result += "Fizz ";
			}
			else {
				result += num.toString() + " ";
			}
			
		}
		
		return result;
	}
	
	public String getBuzz() {
		String result = "";
		for (Integer num: getNumbers().subList(0, 20) ) {
			if ((num % 5) == 0) {
				result += "Buzz ";
			}
			else {
				result += num.toString() + " ";
			}
			
		}
		return result;
	}
	
	public String getFizzBuzz() {
		String result = "";
		for (Integer num: getNumbers().subList(0, 20) ) {
			if ((num % 3) == 0) {
				result += "FizzBuzz ";
			}
			else if((num % 5) == 0) {
				result += "FizzBuzz ";
			}
			else {
				result += num.toString() + " ";
			}
		}
		return result;
	}

}
