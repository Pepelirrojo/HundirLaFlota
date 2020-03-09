package hundirLaFlota;

import java.util.Scanner;

public class Juego {

	private TableroJugador miTablero;
	private TableroEnemigo tableroIA;
	private boolean playing;
	Scanner sc = new Scanner(System.in);
	private int size;

	public Juego() {
		System.out.println("INTRODUZCA LA LONGITUD DEL TABLERO");
		playing = true;
		size = sc.nextInt();
		miTablero = new TableroJugador(size);
		miTablero.colocarBarco(sc.nextInt(), sc.nextInt());
		miTablero.dibujarTablero(miTablero.getTablero());
		tableroIA = new TableroEnemigo(size);
		tableroIA.colocarBarco();
		game();
		// ESTO ES PARA DEBUG
//		System.out.println();
//		tableroIA.dibujarTablero(tableroIA.getTablero());
//		// ESTE ES EL DE VERDAD
//		System.out.println();
//		miTablero.mostrarIntentos();
	}

	public String game() {
		boolean ganador = false;
		int opcion;
		do {
			System.out.println("\nMenu:\n1 = Atacar\n2 = Mostrar Tablero\n0 = Salir");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce las cordenadas de tu ataque.");
				attackJugador(sc.nextInt(), sc.nextInt());
				miTablero.dibujarTablero(miTablero.getTablero());
				attackEnemy();
				miTablero.mostrarIntentos();
				break;
			case 2:
				miTablero.mostrarIntentos();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		} while (playing || opcion == 0);
		return ganador ? "Ganador Putito" : "Perdedor Careca";
	}

	public void attackJugador(int fila, int columna) {
		if (tableroIA.getTablero()[fila][columna] == 1) {
			System.out.println("HIT");
			miTablero.getTableroResultado()[fila][columna] = 3;
		} else {
			System.out.println("Agua");
			miTablero.getTableroResultado()[fila][columna] = 2;
		}
	}

	public void attackEnemy() {
		if (tableroIA.getTablero()[(int) (Math.random() * size)][(int) (Math.random() * size)] == 1) {
			System.out.println("HIT enemigo");
		} else {
			System.out.println("Agua enemigo");
		}
	}
}
