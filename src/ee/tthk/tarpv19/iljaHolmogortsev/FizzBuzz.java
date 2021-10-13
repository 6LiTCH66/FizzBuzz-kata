package ee.tthk.tarpv19.iljaHolmogortsev;

import java.util.ArrayList;

public class FizzBuzz {
	public ArrayList<Integer> getNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 1; i < 101; i++) {
			numbers.add(i);
		}
		
		for(Integer num: numbers) {
			System.out.print(num + " ");
		}
		
		return numbers;
	}

}
