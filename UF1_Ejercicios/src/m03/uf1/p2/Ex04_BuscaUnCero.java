package m03.uf1.p2;

import java.util.Locale;
import java.util.Scanner;

public class Ex04_BuscaUnCero {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("eng", "us"));
        Scanner in = new Scanner(System.in);

        int numero, minimo = 0, maximo = 0;

        do {

            numero = in.nextInt();
            if (maximo < numero) {
                maximo = numero;
            } else if (minimo > numero) {
                minimo = numero;
            }
            if (maximo == 0) {
                maximo = minimo;
            } else if (minimo == 0) {
                minimo = maximo;
            }
        } while (numero != 0 || minimo == 0 && maximo == 0);
        System.out.printf("Mínim: %d%n", minimo);
        System.out.printf("Màxim: %d%n", maximo);

    }
}
