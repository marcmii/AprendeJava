package Sentencia_Condicional;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String rec = "";
        
        System.out.println("Escribe la nota del primer control: ");
        double grade1 = in.nextDouble();
        
        System.out.println("Escribe la nota del segundo control: ");
        double grade2 = in.nextDouble();
        
        // Limpiar el buffer
        in.nextLine(); // Esto consume el salto de línea

        double avg = (grade1 + grade2) / 2;
        
        if (avg < 5) {
            System.out.println("Cual ha sido el resultado de la recu? (apto/no apto): ");
            rec = in.nextLine(); // Ahora sí lee correctamente
        }
        
        if (rec.equals("apto")) {
            System.out.println("Tu nota es un 5");
        }
        
        if (avg >= 5) {
            System.out.println("Tu nota de programación es " + avg);
        } else if (rec.equals("no apto")) {
            System.out.println("Tu nota de programación es " + avg);
        }
        
        in.close(); // Cerrar el escáner
    }
}
