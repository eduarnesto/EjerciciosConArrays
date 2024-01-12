package tema4arrays;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Tabla para guardar 30 números
		int tabla[] = new int[30];

		// Bucle para asignar a cada espacio de la tabla un número
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);
		}
		
		//Ordeno los valores de la tabla
		Arrays.sort(tabla);
		
		//Muestro la tabla ordenada
		System.out.println(Arrays.toString(tabla));
	}

}
