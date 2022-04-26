package m03.uf1.a3;

import java.util.Scanner;

public class Ex14_EsPrimer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero, resto, contador = 0;

        System.out.print("Introdueixi un número: ");
        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            resto = numero % i;
            if (resto == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.printf("El nombre %d és primer.%n", numero);
        } else {
            System.out.printf("El nombre %d NO és primer.%n", numero);
        }
    }
}
