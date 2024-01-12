package tema4arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Tabla para guardar las puntuaciones
		int tabla[] = new int[8];

		// Variable para guardar las puntuaciones
		int num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < tabla.length; i++) {
			// Pregunto por un número
			System.out.println("Introduzca la puntuacion del jugador " + i);

			// Leo del teclado
			num = sc.nextInt();

			// Asigno el numero a un espacio de la tabla
			tabla[i] = num;
		}

		//Ordeno la tabla
		Arrays.sort(tabla);
		
		// Bucle para mostrar los números de la tabla de uno en uno en orden inverso
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}

		// Cierro el Scanner
		sc.close();

	}

}
