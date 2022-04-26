package m03.uf1.a5;

import java.util.Scanner;

public class Ex08_InicialMajuscules {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase;
        String fraseArray[];
        System.out.println("Introdueix una frase:");
        frase = in.nextLine();

        fraseArray = frase.split(" ");
        System.out.println("");
        System.out.println("La frase amb les inicials en majúscules és:");

        for (int i = 0; i < fraseArray.length; i++) {

            if (i == fraseArray.length - 1) {
                System.out.println(fraseArray[i].substring(0, 1).toUpperCase()
                        + fraseArray[i].substring(1));
            } else {
                System.out.print(fraseArray[i].substring(0, 1).toUpperCase()
                        + fraseArray[i].substring(1) + " ");
            }
        }
    }
}
