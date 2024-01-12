package tema4arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Tabla para guardar los numeros de la primitiva
		int primitiva[] = new int[6];

		// Tabla para guardar los numeros de la apuesta
		int apuesta[] = new int[6];
		
		//Variable para guardar la cantidad de numeros que coinciden
		int aciertos=0;

		//Asigno valores a cada tabla
		primitiva= generaNumeros();
		apuesta= generaNumeros();
		
		// Ordeno los valores de las tablas para hacer una busqueda binaria
		Arrays.sort(primitiva);
		Arrays.sort(apuesta);

		//Comparo las dos tablas
		for (int i=0; i<primitiva.length; i++) {
			if (primitiva[i] == apuesta[i]) {
				aciertos++;
			}
		}
		
		//Muestro el número de aciertos
		System.out.println("Has acertado " + aciertos + " numeros");
	}

	public static int[] generaNumeros() {
		int tabla[] = new int[6];
		
		Random r = new Random();

		// Bucle para asignar a cada espacio de la tabla un número
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = r.nextInt(1,50);
		}
		
		return tabla;
	}
}
