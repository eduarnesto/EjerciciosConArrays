package tema4arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Tabla para guardar 1000 números
		int tabla[] = new int[1000];
		
		//Variable para el numero que hay que buscar
		int num;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);

		// Bucle para asignar a cada espacio de la tabla un número
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		
		//Pregunto por un número que buscar
		System.out.println("Introduzca un número para buscar");
		
		//Leo del teclado
		num = sc.nextInt();
		
		//Ordeno los valores de la tabla para hacer una busqueda binaria
		Arrays.sort(tabla);
		
		//Busco el número en la tabla
		System.out.println(Arrays.binarySearch(tabla, num));
		
		//Cierro el Scanner
		sc.close();
	}

}
