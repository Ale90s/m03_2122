package uf2_ejercicios.Examen;

import java.util.Scanner;

public class JocDeTaulaPol {

    public static void main(String[] args) {
        int[][] tauler = creaTauler();
        int intents = 0, pecesColocades = 0;
        Scanner in = new Scanner(System.in);
        while (intents < 10 && pecesColocades < 4) {
            mostraTauler(tauler);
            int fila = demanaInt(in, "Fila:");
            int columna = demanaInt(in, "Columna:");
            if (!tocaVora(fila, columna)) {
                if (!existeixFitxa(tauler, fila, columna)) {
                    tauler[fila][columna] = 2;
                    pecesColocades++;
                } else {
                    System.out.println("Ja existeix una fitxa!!");
                    intents++;
                }
            } else {
                System.out.println("No pot tocar les vores!");
                intents++;
            }
            System.out.println("\n\n");
            if (pecesColocades == 4) {
                System.out.println("HAS GUANYAT!!");
            } else if (intents >= 10) {
                System.out.println("OOOH!! HAS PERDUT!!");
            }
        } // PONER COMPROBACIONES DE HABER GANADO O PERDIDO FUERA YA QUE NO ES NECESARIO
          // COMPROBARLO HASTA QUE SALGA DEL BUCLE WHILE
    }

    public static int demanaInt(Scanner in, String mensaje) {
        int n = 0;
        boolean correcte = false;

        do {
            System.out.print("Introdueix un nombre enter entre 0 i 8(" + mensaje + "): ");
            if (!in.hasNextInt()) {
                System.out.println("No es un enter");
            } else {
                n = in.nextInt();
                if (n >= 0 && n <= 8) {
                    correcte = true;
                } else {
                    System.out.println("Ha de ser entre 0 i 8");
                }
            }
            in.nextLine();
        } while (!correcte);
        return n;
    }

    public static boolean existeixFitxa(int[][] tauler, int fila, int columna) {
        if (tauler[fila][columna] > 0) {
            return true;
        }
        return false;
    }

    public static boolean tocaVora(int fila, int columna) {
        if (fila == 0 || columna == 0 || fila == 8 || columna == 8) {
            return true;
        }
        return false;
    }

    public static int[][] creaTauler() {
        int[][] tauler = new int[8][8];
        int cont = 0, num1, num2;
        while (cont < 20) {
            num1 = generaRandom();
            num2 = generaRandom();
            if (tauler[num1][num2] < 1) {
                tauler[num1][num2] = 1;
                cont++;
            }
        }
        return tauler;
    }

    public static void mostraTauler(int[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int posicio : tauler[i]) {
                switch (posicio) {
                    case 1:
                        System.out.print("B" + "\t");
                        break;
                    case 2:
                        System.out.print("N" + "\t");
                        break;
                    default:
                        System.out.print("0" + "\t");
                        break; // ##############
                }

            }
            System.out.println("");
        }
    }

    public static int generaRandom() {
        return (int) Math.floor(Math.random() * (8));
    }

}
