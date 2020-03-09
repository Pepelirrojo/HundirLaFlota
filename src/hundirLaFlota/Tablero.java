package hundirLaFlota;

public class Tablero {
	protected int[][] tablero;

	public Tablero(int size) {
		crearTablero(size);
	}

	public void crearTablero(int size) {
		tablero = new int[size][size];
	}

	public void dibujarTablero(int[][] tablero) {
		System.out.print("X  ");
		for (int j2 = 0; j2 < tablero.length; j2++) {
			System.out.print(j2 + "  ");
		}
		System.out.println();
		for (int i = 0; i < tablero.length; i++) {
			System.out.print(i + "  ");
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public int[][] getTablero() {
		return tablero;
	}
}
