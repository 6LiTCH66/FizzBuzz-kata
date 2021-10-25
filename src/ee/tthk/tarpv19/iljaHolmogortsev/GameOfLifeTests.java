package ee.tthk.tarpv19.iljaHolmogortsev;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameOfLifeTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void createLivingCell() {
		GameOfLife gol = new GameOfLife();
		CellState actual = gol.createCell(CellState.LIVING);
		
		assertEquals(CellState.LIVING, actual);
	}
	
	@Test
	void createDeadCell() {
		GameOfLife gol = new GameOfLife();
		CellState actual = gol.createCell(CellState.DEAD);
		
		assertEquals(CellState.DEAD, actual);
	}
	@Test
	void createRandomCell() {
		GameOfLife gol = new GameOfLife();
		
		boolean living = false;
		boolean dead = false;
		
		for	(int i = 0; i < 10; i++) {
			CellState actual = gol.createCell();
			if(actual == CellState.LIVING) {
				living = true;
			}
			
			if(actual == CellState.DEAD) {
				dead = true;
			}
		}
		
		assertTrue(living && dead);
	}
	

}
