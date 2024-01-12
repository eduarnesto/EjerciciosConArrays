package tema4arrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variable para el tamaño de la tabla
		int size=0;
		
		//Variable para contador
		int contador=0;
		
		//Tabla
		int tabla[];

		//Calculo el tamaño de la tabla
		for(int i=1;i<=10;i++) {
			size+=i;
		}
		
		//Indico el tamaño de la tabla
		tabla = new int[size];
		
		//Relleno la tabla
		for(int i=1;i<=10;i++) {
			Arrays.fill(tabla, contador, contador+i, i);
			contador+=i;
		}
		
		//Muestro la tabla
		System.out.println(Arrays.toString(tabla));
	}

}
