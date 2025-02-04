package Bucles;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		System.out.println("Entra un numero entero i positivo: ");
		int num = in.nextInt();
		
		while (num <= 0) {
			System.out.println("El numero no es válido. Introducce otro: ");
			num = in.nextInt();
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		
		int addition = num + 100;
		System.out.println();
		System.out.println(addition);
		
		
	}

}
