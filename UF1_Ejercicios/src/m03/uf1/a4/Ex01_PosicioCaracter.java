package m03.uf1.a4;

import java.util.Scanner;

public class Ex01_PosicioCaracter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String posicion;
        int posicionCaracter = 0;

        do {
            System.out.println("Introdueix una frase de 3 o més caràcters:");
            posicion = in.nextLine();

            if (posicion.length() < 3) {
                System.out.println("ERROR: la frase no té la longitud mínima");
            }

        } while (posicion.length() < 3);

        do {
            System.out.print("Indica una posició entre 1 i " + (posicion.length() -  2) + ": ");
            
            if (in.hasNextInt()) {
                posicionCaracter = in.nextInt();
                if (posicionCaracter < 1 || posicionCaracter > posicion.length() - 2) {
                    System.out.println("ERROR: valor fora del rang permés");
                }
            } else {
                System.out.println("ERROR: tipus de dada incorrecte");
                in.nextLine();
            }
        } while (posicionCaracter < 1 || posicionCaracter > posicion.length() - 2);

        System.out.printf("Caràcter a la posició : %s%n", posicion.charAt(posicionCaracter));
        System.out.printf("Caràcter a la posició anterior: %s%n", posicion.charAt(posicionCaracter - 1));
        System.out.printf("Caràcter a la posició posterior: %s%n", posicion.charAt(posicionCaracter + 1));
    }
}
