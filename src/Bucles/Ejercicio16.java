package Bucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * Escribe un programa que diga si un número introducido por teclado es o no
			primo. Un número primo es aquel que sólo es divisible entre él mismo y la
			unidad.

		 */

		
		
		System.out.println("Escribe un numero para identificar si es primo: ");
		int num = in.nextInt();
		
		while (num < 2) {
			System.out.println("Un numero primo no puede ser menor que dos. Escribe otro numero: ");
			num = in.nextInt();
		}
		
		System.out.println(num);
		
	}

}
