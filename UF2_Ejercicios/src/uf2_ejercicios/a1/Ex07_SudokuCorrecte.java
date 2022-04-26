package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex07_SudokuCorrecte {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        do {

            boolean correctRows = true, correctColumns = true, correctRegions = true;
            int filaRegion = 0, columnaRegion = 0;

            int[][] matriz = llegirSudoku();

            for (int i = 0; i < 9; i++) {

                if (!esFilaValida(matriz, i)) {
                    correctRows = false;
                }
                if (!esColumnaValida(matriz, i)) {
                    correctColumns = false;
                }
                if (!esRegioValida(matriz, filaRegion, columnaRegion)) {
                    correctRegions = false;
                }
                columnaRegion += 3;
                if (columnaRegion == 9) {
                    columnaRegion = 0;
                    filaRegion += 3;
                }
            }

            if (correctRows && correctColumns && correctRegions) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            n--;
        } while (n != 0);
    }

    public static int[][] llegirSudoku() {

        Scanner in = new Scanner(System.in);
        int llegirSudoku[][] = new int[9][9];

        for (int i = 0; i < llegirSudoku.length; i++) {
            for (int j = 0; j < llegirSudoku[0].length; j++) {
                llegirSudoku[i][j] = in.nextInt();
            }
        }

        return llegirSudoku;
    }

    public static boolean esFilaValida(int[][] sudoku, int fila) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j) {
                    if (sudoku[fila][i] == sudoku[fila][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esColumnaValida(int[][] sudoku, int columna) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j) {
                    if (sudoku[i][columna] == sudoku[j][columna]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean esRegioValida(int[][] sudoku, int filaInicial, int columnaInicial) {

        int compruebaRegion[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int contador = 0;

        for (int i = 0; i < 9; i++) {

            compruebaRegion[sudoku[filaInicial][columnaInicial] - 1]++;

            columnaInicial++;
            contador++;
            if (contador == 3) {
                contador = 0;
                columnaInicial -= 3;
                filaInicial++;
            }

        }

        for (int i = 0; i < compruebaRegion.length; i++) {
            if (compruebaRegion[i] != 1) {
                return false;
            }
        }

        return true;
    }

}
