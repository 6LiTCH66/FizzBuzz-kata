package ee.tthk.tarpv19.iljaHolmogortsev;

public class GameOfLife {

	public CellState createCell(CellState states, int liveNeighbors) {
		
		if(states == CellState.LIVING && liveNeighbors < 2) {
			return CellState.DEAD;
		}
		if(states == CellState.LIVING && liveNeighbors > 3) {
			return CellState.DEAD;
		}
		if(states == CellState.DEAD	&& liveNeighbors == 3) {
			return CellState.LIVING;
		}
		
		return states;
	}
	
	public CellState createCell(int liveNeighbors) {
		CellState randomCell = CellState.values()[(int) (Math.random() * CellState.values().length)];
		
		if(randomCell == CellState.LIVING && liveNeighbors < 2) {
			return CellState.DEAD;
		}
		if(randomCell == CellState.LIVING && liveNeighbors > 3) {
			return CellState.DEAD;
		}
		if(randomCell == CellState.DEAD	&& liveNeighbors == 3) {
			return CellState.LIVING;
		}
		
		return randomCell;
	}
	
}
