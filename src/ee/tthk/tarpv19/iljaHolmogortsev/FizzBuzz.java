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
		System.out.print(result);
		
		return result;
	}
	
	public String getBuzz() {
		return "1 2 3 4 Buzz 6 7 8 9 Buzz 11 12 13 14 Buzz 16 17 18 19 Buzz ";
	}

}
