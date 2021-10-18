package ee.tthk.tarpv19.iljaHolmogortsev;

import java.util.ArrayList;

public class FizzBuzz {
	public ArrayList<Integer> getNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 1; i < 101; i++) {
			numbers.add(i);
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
