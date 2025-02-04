package Bucles;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        /*
         * Escribe un programa que dados dos números, uno real (base) y un entero
         * positivo (exponente), saque por pantalla todas las potencias con base el
         * numero dado y exponentes entre uno y el exponente introducido. No se deben
         * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
         * se deberán mostrar 21, 22, 23, 24 y 25
         */

        Scanner in = new Scanner(System.in);
        
        System.out.println("Escribe un número para la base: ");
        double base = in.nextDouble(); // Cambiado a double

        System.out.println("Escribe un número (positivo) para el exponente: ");
        int expo = in.nextInt();
        
        // Validar el exponente
        while (expo < 1) { // Cambiado a while para mayor claridad
            System.out.println("Escribe otro número (positivo) para el exponente: ");
            expo = in.nextInt();
        }
        
        for (int i = 1; i <= expo; i++) { // Comenzar desde 1
            double result = 1; // Cambiado a double
            for (int j = 0; j < i; j++) {
                result *= base; // Multiplicar la base
            }
            // Imprimir el resultado
            System.out.println(base + "^" + i + " = " + result);
        }
        
        in.close(); // Cerrar el scanner
    }
}
