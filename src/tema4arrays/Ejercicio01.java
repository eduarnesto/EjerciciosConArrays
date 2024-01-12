package tema4arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variable para el tamaño del array
		int tamano;

		//Variable para el valor por defecto de la tabla
		int defecto;
		
		//Tabla
		int tabla[];
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por el tamaño de la tabla
		System.out.println("Introduzca el tamaño de la tabla");
		
		//Leo del teclado
		tamano = sc.nextInt();
		
		//Creo la tabla con el tamaño que me especifica
		tabla = new int[tamano];
		
		//Pregunto por el valor por defecto de la tabla
		System.out.println("Introduzca el valor por defecto de la tabla");
		
		//Leo del teclado
		defecto = sc.nextInt();
		
		//Relleno la tabla con el valor por defecto
		Arrays.fill(tabla, defecto);
		
		//Muestro la tabla
		System.out.println(Arrays.toString(tabla));
		
		//Cierro el Scanner
		sc.close();
	}

}
