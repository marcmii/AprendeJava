package Bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		System.out.println("Escribe un numero: ");
		int num = in.nextInt();
		
		System.out.println(" Numero | Cuadrado | Cubo");
		
		for (int contador = 0; contador < 5; contador++) {
			
			int square = num * num;
			int cube = num * num * num;
			
			
			System.out.printf(" %d      | %d       | %d %n", num, square, cube);
			
			num++;
			
		}
		
		in.close();
		
	}

}
