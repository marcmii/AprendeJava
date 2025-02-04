package Sentencia_Condicional;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		
		
		System.out.print("Entra un numero entre el 1 i el 7: ");
		int day = in.nextInt();
		
		
		if (day == 1) {
			System.out.print("Dilluns");
		}
		
		if (day == 2) {
			System.out.print("Dimarts");
		}
		
		if (day == 3) {
			System.out.print("Dimecres");
		}
		
		if (day == 4) {
			System.out.print("Dijous");
		}
		
		if (day == 5) {
			System.out.print("Divendres");
		}
		
		if (day == 6) {
			System.out.print("Dissabte");
		}
		
		if (day == 7) {
			System.out.print("Diumenge");
		}
		
		
		in.close();
		
		
	}

}
