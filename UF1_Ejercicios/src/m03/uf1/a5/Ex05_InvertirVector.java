package m03.uf1.a5;

import java.util.Scanner;

public class Ex05_InvertirVector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeros[] = new int[10];

        System.out.println("Introdueixi 10 nombres enters:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introdueixi enter %d:", i + 1);
            numeros[i] = in.nextInt();
        }

        System.out.println("El teu vector és:");

        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.printf("%d.", numeros[i]);
            } else {
                System.out.printf("%d, ", numeros[i]);
            }
        }
        System.out.println("");
        System.out.println("El teu vector invertit és:");

        for (int i = numeros.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.printf("%d.", numeros[i]);
            } else {
                System.out.printf("%d, ", numeros[i]);
            }
        }
        System.out.println("");
    }
}
