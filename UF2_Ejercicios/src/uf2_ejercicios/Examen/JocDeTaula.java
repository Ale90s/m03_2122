package uf2_ejercicios.Examen;

import java.util.Scanner;

public class JocDeTaula {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int array[][] = creaTauler();
        int fila, columna, intentos = 0, aciertos = 0;
        
        while(intentos != 10 && aciertos != 4) {
            
            System.out.printf("Intent %d:%n", intentos + 1);
            System.out.print("Fila: ");
            fila = in.nextInt();
            System.out.print("Columna: ");
            columna = in.nextInt();
            fila--;
            columna--;
            
            if (tocaVora(fila, columna) && existeixFitxa(array, fila, columna)) {
                System.out.println("No és vàlida. Toca la vora i hi ha una fitxa!");
                intentos++;
            } else if (tocaVora(fila, columna)) {
                System.out.println("No és vàlida. Toca la vora!");
                intentos++;
            } else if (existeixFitxa(array, fila, columna)) {
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
                intentos++;
            } else {
                System.out.println("Perfecte! La posició és vàlida");
                array[fila][columna] += 2;
                aciertos++;
            }
        }
            System.out.println("");
        if (aciertos == 4) {
            System.out.println("Enhorabona! Has guanyat!");
        } else {
            System.out.println("Oh no! Has perdut");
        }
        
        mostraTauler(array);
    }

    public static int[][] creaTauler() {

        int array[][] = new int[8][8];

        int filaAleatoria, columnaAleatoria, aux = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        } // PRIMERO PONEMOS TODO EL ARRAY A 0

        do {

            filaAleatoria = (int) (Math.random() * (7 - 0 + 1) + 0);
            columnaAleatoria = (int) (Math.random() * (7 - 0 + 1) + 0);

            if (array[filaAleatoria][columnaAleatoria] == 0) {
                array[filaAleatoria][columnaAleatoria] = 1;
                aux++;
            } // CON LA AYUDA DE NUMEROS ALEATORIOS Y UN AUXILIAR RELLENAMOS HUECOS
            // ALEATORIOS DE 1'S, SOLO EN CASO DE QUE NO HAYA NADA

        } while (aux != 20);

        return array;
    }

    public static boolean tocaVora(int fila, int columna) {
        
        if ((fila > 0 && fila < 7) && (columna > 0 && columna < 7)) {
            return false;
        }
        
        return true;
    }
    
    public static boolean existeixFitxa(int[][] tauler, int fila, int columna) {
        
        if (tauler[fila][columna] != 0) {
            return true;
        }
        
        return false;
    }
    
    public static void mostraTauler(int [][] tauler) {
        
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
                        break;
                    default:
                        System.out.print("X ");
                        break;
                }
            }
            System.out.println("");
        }
    }
}
