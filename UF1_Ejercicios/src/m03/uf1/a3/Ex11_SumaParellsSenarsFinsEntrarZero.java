package m03.uf1.a3;

import java.util.Scanner;

public class Ex11_SumaParellsSenarsFinsEntrarZero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, pares = 0, impares = 0;

        System.out.print("Introdueix un nombre (0 per acabar): ");
        n = in.nextInt();

        while (n != 0) {
            if (n % 2 == 0) {
                pares = pares + n;
            } else if (n % 2 != 0) {
                impares = impares + n;
            }
            System.out.print("Introdueix un nombre (0 per acabar): ");
            n = in.nextInt();
        }
        System.out.printf("La suma dels parells introduïts és: %d%n", pares);
        System.out.printf("La suma dels senars introduïts és: %d%n", impares);
    }
}