package Sentencia_Condicional;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Realiza un programa que calcule la media de tres notas

		double grade1 = 10;
		double grade2 = 10;
		double grade3 = 10;
		
		if (grade1 < 0 || grade1 > 10) {
			System.out.println("La nota no es válida");
		}
	
		if (grade2 < 0 || grade2 > 10) {
			System.out.println("La nota no es válida");
		}
		
		if (grade3 < 0 || grade3 > 10) {
			System.out.println("La nota no es válida");
		}
		
		
		double avg = (grade1 + grade2 + grade3) / 3;
		
		System.out.printf("La media és: %.2f ", avg);
		
		if (avg < 5) {
            System.out.println("Insuficiente");
        } else if (avg < 7) {
            System.out.println("Suficiente");
        } else if (avg < 9) {
            System.out.println("Notable");
        } else if (avg <= 10) {
            System.out.println("Sobresaliente");
        }
		
	}

}
