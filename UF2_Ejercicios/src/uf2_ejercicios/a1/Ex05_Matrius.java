package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex05_Matrius {

    public static void main(String[] args) {
        
        /* TEST MOSTRAMATRIU */
//        int contador = 0, filas = 3, columnas = 3;
//        int testMatriz [][] = new int[filas][columnas];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                contador++;
//                testMatriz[i][j] = contador;
//            }
//        }
//        mostraMatriu(testMatriz);
        
//        /* TEST DEMANAMATRIU */
//        int fila = 2;
//        int columna = 3;
//        int matriz [][] = demanaMatriu(fila, columna);
//        
//        mostraMatriu(matriz);

        /* TEST DEMANAMATRIU */
//        int fila = 10;
//        int columna = 10;
//        int matriz [][] = generaMatriu(fila, columna, 1, 9);
//        
//        mostraMatriu(matriz);

    }
    public static void mostraMatriu(int[][] matriu) {
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                System.out.printf("%2d", matriu[i][j]);
            }
            System.out.println("");
        }
    }
    public static int[][] demanaMatriu(int files, int columnes) {
        
        Scanner in = new Scanner(System.in);
        int [][] nuevaMatriz = new int [files][columnes];
        int numeroColumna = 0;
        
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (j == 0) {
                    numeroColumna = in.nextInt();
                    nuevaMatriz[i][j] = numeroColumna;
                } else {
                    nuevaMatriz[i][j] = numeroColumna;
                }
            }
        }
        return nuevaMatriz;
    }
    public static int[][] generaMatriu(int files, int columnes, int min, int max) {
        int [][] nuevaMatriz = new int [files][columnes];
        
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                int numeroAleatorio = (int)(Math.random() * (max - min + 1) + min);
                nuevaMatriz[i][j] = numeroAleatorio;
            }
        }
        
        return nuevaMatriz;
    }
}