package m03.uf1.p4;

import java.util.Scanner;

public class Ex08_MatriuTransposada {

    public static final int FILES = 4;
    public static final int COLUMNES = 4;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[FILES][COLUMNES];
        int traca = 0;

        // BUCLE DE ESCRITURA
        for (int i = 0; i < FILES; i++) {
            for (int j = 0; j < COLUMNES; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        // BUCLE DE LECTURA
        for (int i = 0; i < FILES; i++) {
            for (int j = 0; j < COLUMNES; j++) {
                if (j == COLUMNES - 1) {
                    System.out.printf("%d", matriz[i][j]);
                } else {
                    System.out.printf("%d\t", matriz[i][j]);
                }
                

                if (i == j) {
                    traca += matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.printf("Traça: %d%n%n", traca);

        System.out.println("Matriu transposada:");
        // BUCLE DE LECTURA MATRIU TRANSPOSADA
        for (int i = 0; i < COLUMNES; i++) {
            for (int j = 0; j < FILES; j++) {
                if (j == COLUMNES - 1) {
                    System.out.printf("%d", matriz[j][i]);
                } else {
                    System.out.printf("%d\t", matriz[j][i]);
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
