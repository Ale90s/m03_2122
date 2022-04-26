package m03.uf1.a4;

import java.util.Scanner;

public class Ex06_InicialMajuscules {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "iso-8859-1");
        String frase, fraseMayuscula;
        char letra;

        System.out.println("Introdueix una frase:");
        frase = in.nextLine();
        fraseMayuscula = frase.toUpperCase();
        frase = frase.toLowerCase();

        System.out.println("");
        System.out.println("La frase amb les inicials en majúscules és:");

        for (int i = 0; i < frase.length(); i++) {
            // SE VA IMPRIMIENTO LA LETRA UNA POR UNA, SI DETECTA QUE ES EL PRINCIPIO DE UNA
            // FRASE IMPRIME EL CARACTER EN MAYUSCULA DE ESA FRASE.
            if (i == 0 && frase.charAt(0) != ' ') {

                System.out.print(fraseMayuscula.charAt(i));

            } else if (frase.charAt(i) == ' ') {

                System.out.print(frase.charAt(i));
                if (frase.charAt(i + 1) != ' ') {

                    System.out.print(fraseMayuscula.charAt(i + 1));
                }
            } else {
                if (frase.charAt(i - 1) != ' ') {

                    System.out.print(frase.charAt(i));
                }
            }
        }
        System.out.println("");
    }
}
