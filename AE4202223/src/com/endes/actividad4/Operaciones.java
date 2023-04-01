package com.endes.actividad4;

import java.util.Scanner;
/**
 * Clase Operaciones para realizar la suma, resta, multiplicación y 
 * división
 * @author javier
 *
 */
public class Operaciones {
	/**
	 *Método main que ejecuta el programa principal  
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaración de variables
		int x,y;
		int suma, resta, multiplicacion, division;
		
		//Pedir e introducir valor del primer número
		System.out.println("Introduzca un número entero");
		Scanner var1 = new Scanner(System.in);
		x = var1.nextInt();
		
		//Pedir e introducir valor del segundo número
		System.out.println("Introduzca otro número entero");
		Scanner var2 = new Scanner(System.in);
		y = var2.nextInt();
		
		//Realización de las operaciones
		suma = x+y;
		resta = x-y;
		multiplicacion = x+y;
		division = x/y;
		
		//Mostrar por pantalla los resultados
		System.out.println("La Suma es = "+suma);
		System.out.println("La Resta es = "+resta);
		System.out.println("La suma es = "+multiplicacion);
		System.out.println("La suma es = "+division);
		
		

	}

}
