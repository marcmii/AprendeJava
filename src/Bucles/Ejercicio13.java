package Bucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int conP = 0; //contador numeros positivos
		int conN = 0; //contador numeros negativos
		
		for (int i = 0; i<10; i++) {
			System.out.printf("Escribe un numero para la posicion %d: %n", i);
			int num = in.nextInt();
			
			if (num < 0) {
				conN++;
			}
			else {
				conP++;
			}
		}
		
		System.out.println("Hay " + conP + " numeros positius i " + conN + " negatius");
		in.close();
		
	}

}
