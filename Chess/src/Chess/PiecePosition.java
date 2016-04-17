package Chess;

public class PiecePosition {

	/**
	 *  Esta funcion nos debuelve "true " o "false" segun si el movimiento
         * de la pieza es posible o no , concretamente nos dice la posicio que 
         * hemos introducido esta o no dentro de nuestro tablero, de tal manera 
         * que si ponemos una posicion duera de tablero dira "false" 
	 */
	public static boolean isAvailable(int column, int row) {
		return column >= 0 && column < 8 && row >= 0 && row < 8;
	}

	/**
	 * Esta Funcion es la encargada de mover la pieza de su ubicacion acrual
         * a la siguiente , para ello recibe la posicion actual y la "X" y la "y"
         * de la nueva posicion, si introducimos ina posicion que NO TENGA 
         * PIEZAS no nos dejara mover , mientras que si es una posicion actual 
         * valida lo que ara sera "Clonar" la pieza que esta en esa posicion 
         * a la posicion indicada y despues borrar la pieza de su ubicacion 
         * anterior
	 */
	static boolean isAvailable(PiecePosition position, int columnIncrement, int rowIncrement) {
		if (position == null)
			return false;
		
		int newColumn = position.getColumn() + columnIncrement;
		int newRow = position.getRow() + rowIncrement;
		return isAvailable(newColumn, newRow);
	}

	/**
	 * 
	 */
	static boolean isAvailable(PiecePosition position) {
		if (position == null)
			return false;
		return isAvailable(position.getColumn(), position.getRow());
	}

	private int column, row;

	/**
	 * 
	 */
	public PiecePosition(int column, int row) {
		this.column = column;
		this.row = row;
	}
	
	/**
	 * 
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * 
	 */
	public int getRow() {
		return row;
	}
	
	public boolean setValues(int column, int row) {
		if (isAvailable(column, row)) {
			this.column = column;
			this.row = row;			
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 */
	public PiecePosition getDisplacedPiece(int columnCount, int rowCount) {		
		if (!isAvailable(this, columnCount, rowCount))
			return null;
		int newColumn = getColumn() + columnCount;
		int newRow = getRow() + rowCount;
		return new PiecePosition(newColumn, newRow);
	}
	
	/**
	 * 
	 */
	public PiecePosition clone() {
		return new PiecePosition(column, row);
	}
	
	/**
	 * 
	 */
	public boolean equals(PiecePosition aPosition) {
		return aPosition.getColumn() == getColumn() && aPosition.getRow() == getRow();
	}
}
