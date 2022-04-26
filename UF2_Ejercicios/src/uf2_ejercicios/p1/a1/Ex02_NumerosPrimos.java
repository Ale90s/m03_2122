package uf2_ejercicios.p1.a1;

import java.util.Scanner;

public class Ex02_NumerosPrimos {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int primeNumbers = in.nextInt(), n = 2, aux = 0;
        int primers [] = new int [primeNumbers];
        
        
        do {
            if (esNombrePrimer(n)) {
                primers[aux] = n;
                n++;
                aux++;
            } else {
                n++;
            }
        } while (primers[primeNumbers - 1] == 0);
        
        mostraVector(primers);
    }
    
    public static boolean esNombrePrimer(int nombre) {
        
        int counter = 0;
        
        for (int i = 1; i <= nombre; i++) {
            if (nombre % i == 0) {
                counter++;
            }
            
            if (counter > 2) {
                return false;
            }
        }
        return true;
    }
    
    public static void mostraVector(int[] primers) {
        
        int counter = 0;
        for (int i = 0; i < primers.length; i++) {
            if (i == primers.length - 1) {
                System.out.printf("%d.", primers[i]);
            } else {
                System.out.printf("%d, ", primers[i]);
            }
            counter++;
            if (counter == 10) {
                System.out.println("");
                counter = 0;
            }
        }
        
    }
}
