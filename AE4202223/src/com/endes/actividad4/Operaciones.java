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
		suma = sumar(x, y);
		resta = restar(x, y);
		multiplicacion = multiplicar(x, y);
		division = dividir(x, y);
		
		//Mostrar por pantalla los resultados
		visualizar(suma, resta, multiplicacion, division);
		
		

	}

	private static void visualizar(int suma, int resta, int multiplicacion, int division) {
		System.out.println("La Suma es = "+suma);
		System.out.println("La Resta es = "+resta);
		System.out.println("La suma es = "+multiplicacion);
		System.out.println("La suma es = "+division);
	}

	private static int dividir(int x, int y) {
		int division;
		division = x/y;
		return division;
	}

	private static int multiplicar(int x, int y) {
		int multiplicacion;
		multiplicacion = x*y;
		return multiplicacion;
	}

	private static int restar(int x, int y) {
		int resta;
		resta = x-y;
		return resta;
	}

	private static int sumar(int x, int y) {
		int suma;
		suma = x+y;
		return suma;
	}

}
