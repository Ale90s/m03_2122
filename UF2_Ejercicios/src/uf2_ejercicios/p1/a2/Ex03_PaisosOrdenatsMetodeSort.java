package uf2_ejercicios.p1.a2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_PaisosOrdenatsMetodeSort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nPaisos = in.nextInt();
        in.nextLine();
        String[] paises = new String[nPaisos];

        for (int i = 0; i < paises.length; i++) {
            paises[i] = in.nextLine();
        }

        System.out.println("Països ordenats:");
        Arrays.sort(paises);
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }
}
