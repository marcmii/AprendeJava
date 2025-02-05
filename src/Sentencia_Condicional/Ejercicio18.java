package Sentencia_Condicional;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escribe un número de hasta 5 cifras (positivo): ");
        int num = in.nextInt();
        
        // Validar el número
        while (num > 99999 || num < 0) {
            System.out.println("Número no válido. Escriba otro: ");
            num = in.nextInt();
        }
        
        // Almacenar el número original
        int originalNum = num;

        // Extraer la primera cifra
        while (num >= 10) {
            num /= 10; // Dividir por 10 hasta que quede solo la primera cifra
        }
        
        // Mostrar la primera cifra
        System.out.println("La primera cifra de " + originalNum + " es: " + num);
        
        in.close(); // Cerrar el escáner
    }
}
