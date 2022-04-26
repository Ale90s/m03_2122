package m03.uf1.a4;

import java.util.Scanner;

public class Ex05_ComptaCaracter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase, letra;

        System.out.println("Introdueix una frase:");
        frase = in.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            //BLOQUE QUE DETECTA LA POSICION DE LA PRIMERA LETRA DE UNA PALABRA
            if (i == 0 && frase.charAt(0) != ' ') {
                //    System.out.println(frase.charAt(0));
                //   frase = frase.substring(0, 1).toUpperCase() + frase.substring(1);
            } else if (frase.charAt(i) == ' ') {

                if (frase.charAt(i + 1) != ' ') {
                    //    System.out.println(frase.charAt(i + 1));
                    //    frase = frase.substring(i).toUpperCase() + frase.substring(i + 1);
                }
            }
        }

        System.out.println("");
        System.out.println("La frase amb les inicials en majúscules és:");
        System.out.println("");
        System.out.println(frase);

    }
}
