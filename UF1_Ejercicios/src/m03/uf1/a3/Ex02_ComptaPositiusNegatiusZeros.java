package m03.uf1.a3;

import java.util.Scanner;

public class Ex02_ComptaPositiusNegatiusZeros {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, zero = 0;

        System.out.printf("Introdueix 10 nombre enters: %n");
        System.out.println("");

        for (int i = 1; i <= 10; i++) {

            System.out.printf("Nombre %d =", i);
            numero = in.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else if (numero == 0) {
                zero++;
            }
        }
        System.out.printf("Entre els valors que has introduït hi ha:%n");
        System.out.printf(" - %d nombre/s positiu/s.%n", positivos);
        System.out.printf(" - %d nombre/s negatiu/s.%n", negativos);
        System.out.printf(" - %d nombre/s zero (0).%n", zero);
    }
}
