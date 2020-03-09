package hundirLaFlota;

public class TableroJugador extends Tablero {

	private int[][] tableroResultado;

	public TableroJugador(int size) {
		super(size);
		tableroResultado = new int[size][size];
	}

	public void colocarBarco(int fila, int columna) {
		tablero[fila][columna] = 1;
	}
	public void mostrarIntentos() {
	dibujarTablero(tableroResultado);
	}

	public int[][] getTableroResultado() {
		return tableroResultado;
	}
	
}
