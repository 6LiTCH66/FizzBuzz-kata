package ee.tthk.tarpv19.iljaHolmogortsev;

public class Cell {
	public CellState states;
	int liveNeighbors;
	
	public Cell(CellState states, int liveNeighbors) {
		this.states = states;
		this.liveNeighbors = liveNeighbors;
	}

	public CellState getState() {
		
		if(states == CellState.LIVING && liveNeighbors < 2) {
		return CellState.DEAD;
		}
		if(states == CellState.LIVING && liveNeighbors > 3) {
			return CellState.DEAD;
		}
		if(states == CellState.DEAD	&& liveNeighbors == 3) {
			return CellState.LIVING;
		}
	
		return this.states;
	}

}
