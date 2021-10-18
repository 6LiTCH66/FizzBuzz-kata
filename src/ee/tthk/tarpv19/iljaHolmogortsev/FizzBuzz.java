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
		return "1 2 Fizz 4 5 Fizz 7 8 Fizz 10 11 Fizz 13 14 Fizz 16 17 Fizz 19 20 ";
	}

}
