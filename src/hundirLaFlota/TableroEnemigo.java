package hundirLaFlota;

public class TableroEnemigo extends Tablero {
	public TableroEnemigo(int size) {
		super(size);
	}

	public void colocarBarco() {
		tablero[(int) (Math.random() * tablero.length)][(int) (Math.random() * tablero.length)] = 1;
	}
}
