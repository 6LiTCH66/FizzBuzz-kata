package ee.tthk.tarpv19.iljaHolmogortsev;

import static org.junit.jupiter.api.Assertions.*;

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
		
		assertEquals(100, fb.getNumbers().size());
	}
	
	@Test
	void shouldReturnFizzInstedOfNumberThatDividedByThree() {
		FizzBuzz fb = new FizzBuzz();
		String expected = "1 2 Fizz 4 5 Fizz 7 8 Fizz 10 11 Fizz 13 14 Fizz 16 17 Fizz 19 20 ";
		
		assertEquals("", fb.getFizz());
	}
	
	

}
