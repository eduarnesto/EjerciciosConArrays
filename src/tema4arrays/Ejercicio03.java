package tema4arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Tabla para guardar 10 números
		int tabla1[] = new int[10];
		
		// Tabla 2 para guardar 10 números
		int tabla2[] = new int[10];

		// Variable para guardar el número que escriba el usuario
		int num;
		
		//Boolean para saber si las tablas son iguales
		boolean igual;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para asignar a cada espacio de la tabla un número que introduzca el
		// usuario
		for (int i = 0; i < 20; i++) {
			// Pregunto por un número
			System.out.println("Introduzca un número");

			// Leo del teclado
			num = sc.nextInt();

			//Comrpuebo si la primera tabla está completa
			if (i<10) {
				tabla1[i] = num;
			} else {
				tabla2[i-10] = num;
			}
		}

		//Compruebo si las tablas son iguales
		igual = Arrays.equals(tabla1, tabla2);
		
		//Muestro si son iguales
		System.out.println("¿Son las tablas iguales? " + igual);

		// Cierro el Scanner
		sc.close();

	}

}
