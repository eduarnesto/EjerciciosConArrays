package tema4arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Tabla para guardar los numeros de la primitiva
		int primitiva[] = {1, 2, 3, 32, 44, 13};

		// Tabla para guardar los numeros de la apuesta
		int apuesta[] = new int[6];
		
		//Random para crear numeros aleatorios
		Random r = new Random();
		
		//Variable para guardar la cantidad de numeros que coinciden
		int aciertos=0;

		//Asigno valores a la tabla de apuesta
		for (int i = 0; i < apuesta.length; i++) {
			apuesta[i] = r.nextInt(1,50);
			compruebaNumeros(apuesta, i);
		}
		
		// Ordeno los valores de las tablas para hacer una busqueda binaria
		Arrays.sort(primitiva);
		Arrays.sort(apuesta);

		//Comparo las dos tablas
		for (int i=0; i<primitiva.length; i++) {
			if (primitiva[i] == apuesta[i]) {
				aciertos++;
			}
		}
		
		//Muestro la tabla de apuesta
		System.out.println(Arrays.toString(apuesta));
		
		//Muestro la tabla de primitiva
		System.out.println(Arrays.toString(primitiva));
		
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
	
	public static void compruebaNumeros(int apuesta[], int posicion) {
		Random r = new Random();
		for (int j = 0; j<posicion; j++) {
			if(apuesta[posicion]==apuesta[j]) {
				apuesta[posicion] = r.nextInt(1,50);
				compruebaNumeros(apuesta, posicion);
			}
		}
	}
}
