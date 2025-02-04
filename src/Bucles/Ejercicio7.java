package Bucles;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Realiza el control de acceso a una caja fuerte.
        
        Scanner in = new Scanner(System.in);
        
        int i = 1234; // combinacio caixa forte
        int j = 0;
        int opp = 1;
        boolean accedido = false; // Variable per controlar si s'ha encertat

        do {
            System.out.print("Escribe la combinación de la caja fuerte: ");
            j = in.nextInt();
            
            if (j == i) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                accedido = true; // Marquem que s'ha encertat
                break; // Sortim del bucle
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
            
            opp++;
            
        } while (opp <= 4);
        
        // Si no s'ha encertat després de 4 intents
        if (!accedido) {
            System.out.println("HAS SUPERAT ELS 4 INTENTS");
        }
        
        System.out.println("Has sortit del bucle");
    }
}
