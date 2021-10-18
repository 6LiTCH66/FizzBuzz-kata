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
		assertArrayEquals(expected, fb.getNumbers());
	}
	
	@Test
	void shouldReturnFizzInstedOfNumberThatDividedByThree() {
		FizzBuzz fb = new FizzBuzz();

		String expected = "1 2 Fizz 4 5 Fizz 7 8 Fizz 10 11 Fizz 13 14 Fizz 16 17 Fizz 19 20 ";
		
		assertEquals(expected, fb.getFizz());
	}
	@Test
	void shouldReturnBuzzInstedOfNumberThatDividedByFive() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "1 2 3 4 Buzz 6 7 8 9 Buzz 11 12 13 14 Buzz 16 17 18 19 Buzz ";
		
		assertEquals(expected, fb.getBuzz());
	}
	
	
	@Test
	void shouldReturnFizzBuzzInstedOfNumberThatDividedByThreeAndFive() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "1 2 FizzBuzz 4 FizzBuzz FizzBuzz 7 8 FizzBuzz FizzBuzz 11 FizzBuzz 13 14 FizzBuzz 16 17 FizzBuzz 19 FizzBuzz ";
		
		assertEquals(expected, fb.getFizzBuzz());
	}
	
	

}
