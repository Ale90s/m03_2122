package m03.uf1.p3;

import java.util.Scanner;

public class Ex05_PosicionCaracter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), caracter = in.nextLine();
        char caracterFrase = caracter.charAt(0);

        System.out.printf("El caràcter '%s' apareix a les posicions:%n", caracterFrase);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracterFrase) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}