package ee.tthk.tarpv19.iljaHolmogortsev;

public class GameOfLife {

	public CellState createCell(CellState states) {
		
		return states;
	}
	
	public CellState createCell() {
		
		return CellState.values()[(int) (Math.random() * CellState.values().length)];
	}
	
}
