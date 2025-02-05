package Sentencia_Condicional;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Por favor, introduce el valor de a: ");
        int a = in.nextInt();
        
        System.out.println("Por favor, introduce el valor de b: ");
        int b = in.nextInt();
        
        // Declarar x antes de usarlo
        double x = 0; // Usamos double para manejar resultados decimales y evitar problemas de alcance
        
        if (a != 0) {
            x = - (double) b / a; // Aseguramos que la división sea decimal
            System.out.println("x = " + x);
        } else {
            if (b != 0) {
                System.out.println("La ecuación no tiene solución real.");
            } else {
                System.out.println("Hay infinitas soluciones.");
            }
        }
        
        in.close(); // Cerrar el escáner para evitar fugas de recursos
    }
}
