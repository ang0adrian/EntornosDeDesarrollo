package Chess;

public class PiecePosition {

	/**
         * Esta función nos devuelve un  boleano , que nos indica si la posicion
         * que le hemos introducido esta dentro de nuestro tablero o no
         * 
         * @param column Columna a comprobar.
         * @param row Fila a comprobar
         * @return Devuelve si 
         */
	public static boolean isAvailable(int column, int row) {
		return column >= 0 && column < 8 && row >= 0 && row < 8;
	}

	/*
            Esta función comprueba si hay una pieza en la casilla que buscamos,
            si esta libre nos devolvera un boleano
        */
	static boolean isAvailable(PiecePosition position, int columnIncrement, int rowIncrement) {
		if (position == null)
			return false;
		
		int newColumn = position.getColumn() + columnIncrement;
		int newRow = position.getRow() + rowIncrement;
		return isAvailable(newColumn, newRow);
	}

	/**
         * Esta función comprueba si hay una pieza de forma genérica
	 */
	static boolean isAvailable(PiecePosition position) {
		if (position == null)
			return false;
		return isAvailable(position.getColumn(), position.getRow());
	}

	private int column, row;

	/**
	 * ESta funcion cambia la posicion actual de la pieza a la que nosotros 
         * le indiquemos
	 */
	public PiecePosition(int column, int row) {
		this.column = column;
		this.row = row;
	}
	
	/**
	 * Esta posicion devielve la columna en la cuel esta la pieza
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * Esata funcion nos dice en la fila que se encuentra la pieza
	 */
	public int getRow() {
		return row;
	}
	
        /*
            Esta funcion nos comprueba si la fila y columna que le introducimos esta disponible,
            y si es asi cambia nuestra pieza a esa posicion
        */
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
	 * Esta funcion Se encarga de clonar una pieza
	 */
	public PiecePosition clone() {
		return new PiecePosition(column, row);
	}
	
	/**
	 * Esta funcion comprueba si hay 2 piezas en el mismo lugar del tablero
	 */
	public boolean equals(PiecePosition aPosition) {
		return aPosition.getColumn() == getColumn() && aPosition.getRow() == getRow();
	}
}
