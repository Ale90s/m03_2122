package m03.uf1.a5;

import java.util.Scanner;

public class Ex11_MatriuProducte {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int files, columnes;
        int producte[][];

        System.out.print("Indiqui el nombre de files: ");
        files = in.nextInt();
        System.out.print("Indiqui el nombre de columnes: ");
        columnes = in.nextInt();

        producte = new int[files][columnes];

        for (int i = 0; i < columnes; i++) {

            if (i == 0) {
                System.out.printf("        %d", i);
            } else {
                System.out.printf("   %d", i);
            }
        }
        System.out.println("");
        for (int i = 0; i < columnes; i++) {

            if (i == 0) {
                System.out.printf("---------", i);
            } else {
                System.out.printf("----");
            }
        }
        System.out.println("");

        for (int i = 0; i < files; i++) {
            System.out.print(i + "  |   ");
            for (int j = 0; j < columnes; j++) {
                producte[i][j] = i * j;
                System.out.printf("%2d  ", producte[i][j]);
            }
            System.out.println("");
        }
    }
}
