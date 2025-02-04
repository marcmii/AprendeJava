package Bucles;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub

		System.out.println("Escribe el primer numero: ");
		int num1 = in.nextInt();
		
		System.out.println("Escribe el segundo numero: ");
		int num2 = in.nextInt();
		
		//Validation != numbers
		while (num1 == num2) {
			System.out.println("No pueden ser iguales. Escribe el segundo numero otra vez: ");
			num2 = in.nextInt();
		}
		
		int menor;
		int mayor;
		
		if (num1 < num2) {
			menor = num1;
			mayor = num2;
		}
		else {
			menor = num2;
			mayor = num1;
		}
		
		for (int i = menor; i < mayor; i+=7) {
			System.out.println(i);
		}
		
	}

}
