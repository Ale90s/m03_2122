package m03.uf1.a3;

import java.util.Scanner;

public class Ex01_TaulaMultiplicar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Introdueix un nombre natural: ");
        int numero = in.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %2d =  %d%n", numero, i, numero * i);
        }
    }
}
