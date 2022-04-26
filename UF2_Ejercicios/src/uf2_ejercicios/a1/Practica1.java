package uf2_ejercicios.a1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int matriz[][] = creaTauler();
        int intentos = 0, fichasColocadas = 0, testFila, testColumna;

        while (intentos < 10 && fichasColocadas < 4) {

            System.out.printf("Intent %d:%n", intentos + 1);

            System.out.print("Fila: ");
            testFila = in.nextInt();
            testFila--;
            System.out.print("Columna: ");
            testColumna = in.nextInt();
            testColumna--;

            if (!existeixFitxa(matriz, testFila, testColumna)
                    && !tocaVora(testFila, testColumna)) {
                matriz[testFila][testColumna] += 2;
                System.out.println("Perfecte! La posició és vàlida");
                fichasColocadas++;

            } else if (existeixFitxa(matriz, testFila, testColumna)
                    && tocaVora(testFila, testColumna)) {
                System.out.println("No és vàlida. Ja hi ha una fitxa i la vora!");
                intentos++;
            } else if (existeixFitxa(matriz, testFila, testColumna)) {
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
                intentos++;
            } else {
                System.out.println("No és vàlida. és la vora!");
                intentos++;
            }
            System.out.println("");
        }

        if (fichasColocadas == 4) {
            System.out.println("Enhorabona! Has guanyat!");
        } else {
            System.out.println("Oh no! Has perdut!!");
        }
        mostraTauler(matriz);
    }

    public static int[][] creaTauler() {

        int[][] matriz = new int[8][8];
        int aux = 0, randomFila, randomColumna;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 0;
            }
        } // INICIAMOS TODO A 0

        while (aux < 20) {

            randomFila = (int) (Math.random() * ((matriz.length - 1) - 0 + 1) + 0);
            randomColumna = (int) (Math.random() * ((matriz[0].length - 1) - 0 + 1) + 0);

            if (matriz[randomFila][randomColumna] == 0) {

                matriz[randomFila][randomColumna]++;
                aux++;
            } // METEMOS NUMEROS ALEATORIOS PARA LAS FICHAS BLANCAS
        }

        return matriz;
    }

    public static boolean tocaVora(int fila, int columna) {

        if ((fila > 0 && fila < 7) && (columna > 0 && columna < 7)) {
            return false;
        }
        return true;
    }

    public static boolean existeixFitxa(int[][] tauler, int fila, int columna) {

        if (tauler[fila][columna] == 0) {
            return false;
        }
        return true;
    }

    public static void mostraTauler(int[][] tauler) {
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("El tauler:");
        
        for (int[] tauler1 : tauler) {
            for (int j = 0; j < tauler[0].length; j++) {
                switch (tauler1[j]) {
                    case 0:
                        System.out.print("0 ");
                        break;
                    case 1:
                        System.out.print("B ");
                        break;
                    case 2:
                        System.out.print("N ");
                    default:
                        break;
                }
            }
            System.out.println("");
        }
    }
}
