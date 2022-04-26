package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex10_TaulesMultiplicar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Quantes taules de multiplicar vols mostrar? ");

        int nTablas = in.nextInt();
        multTables(nTablas);

    }

    public static void multTables(int n) {

        boolean finished = false;
        int table = 1;
        int deCuatroEnCuatro = n;
        do {
            if (deCuatroEnCuatro >= 4) {
                for (int i = 1; i <= 10; i++) {

                    System.out.printf("%d x %2d = %2d\t", table, i, table * i);
                    
                    System.out.println("");
                }
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %2d = %2d%n", table, i, table * i);
                }
            }
            if (table != n) {
                table++;
            } else {
                finished = true;
            }

        } while (!finished);
    }
}
