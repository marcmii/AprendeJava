package Bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = 0;
		int contador = -1;
		int suma = 0;
	
		 while (num >= 0) {
			 System.out.println("Escribe un numero: ");
			 num = in.nextInt();
			 
			 if (num >= 0) {
				 suma += num;
			 }
			 
			 
			 contador++;
		 }
		
		 int mitjana = contador / num;
		 
		 System.out.println(contador);
		 System.out.println(suma);
		 System.out.println(mitjana);
	}

}
