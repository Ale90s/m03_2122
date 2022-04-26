package m03.uf1.a5;

import java.util.Scanner;

public class Ex04_LlegirMostrarVector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Introdueix el valor de la posició %d: ", i);
            numeros[i] = in.nextInt();

        }
        
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("El valor de la posició %d es: %d%n", i, numeros[i]);
        }
    }
}