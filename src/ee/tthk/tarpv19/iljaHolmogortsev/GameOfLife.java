package ee.tthk.tarpv19.iljaHolmogortsev;

public class GameOfLife {

	public Cell createCell(CellState states, int liveNeighbors) {
		return new Cell(states, liveNeighbors);
		
	}
	
	public Cell createCell(int liveNeighbors) {
		CellState randomCell = CellState.values()[(int) (Math.random() * CellState.values().length)];
		return new Cell(randomCell, liveNeighbors);
	}
	
}
