package m03.uf1.a4;

import java.util.Scanner;

public class Ex03_cercaTextFinal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String primera, segunda;

        System.out.println("Introdueix una frase:");
        primera = in.nextLine();
        System.out.println("Introdueix una altra frase:");
        segunda = in.nextLine();
        if (primera.endsWith(segunda)) {
            System.out.println("La primera frase finalitza amb la segona.");
        } else {
            System.out.println("La primera frase NO finalitza amb la segona.");
        }
    }
}
