package Bucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/* Escribe un programa que pida una base y un exponente (entero positivo) y que
		 calcule la potencia.
		*/
		Scanner in = new Scanner(System.in);
		
		int result = 1;
		
		System.out.println("Escribe un numero para la base: ");
		int base = in.nextInt();
		
		System.out.println("Escribe un numero (positivo) para el exponente: ");
		int exp = in.nextInt();
		
		// Validate the exponent
		while (exp < 0) {
			System.out.println("Vuelve a escribir un numero (positvo) para el exponente: ");
			exp = in.nextInt();
		}
			
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		
		System.out.println(result);
		
	}

}
