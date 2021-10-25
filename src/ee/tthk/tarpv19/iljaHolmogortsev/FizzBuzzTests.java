package ee.tthk.tarpv19.iljaHolmogortsev;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void shouldReturnOneHundredNumbers() { 
		FizzBuzz fb = new FizzBuzz();
		int[] expected = IntStream.range(1, 101).toArray();
		assertArrayEquals(expected, Arrays.stream(fb.getNumbers()).mapToInt(Integer::parseInt).toArray());
	}
	
	@Test
	void shouldReturnFizzInstedOfNumberThatDividedByThree() {
		FizzBuzz fb = new FizzBuzz();
		
		for (int i = 1; i <= fb.getNumbers().length; i++) {
			if((i % 3) == 0) {
				assertEquals("Fizz", fb.getFizzBuzz(i));
			}
			else if((i % 5) == 0) {
				assertEquals("Buzz", fb.getFizzBuzz(i));
			}
			else if((i % 15) == 0) {
				assertEquals("FizzBuzz", fb.getFizzBuzz(i));
			}
			
		}
		
	}
	
	

}