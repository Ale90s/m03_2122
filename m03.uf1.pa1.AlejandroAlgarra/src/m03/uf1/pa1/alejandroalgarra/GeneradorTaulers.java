package m03.uf1.pa1.alejandroalgarra;

import java.util.Scanner;

public class GeneradorTaulers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamanoAjedrez, lateralAjedrez;

        System.out.printf("Introdueix un nombre natural major que zero: ");
        tamanoAjedrez = in.nextInt();

        tamanoAjedrez = (tamanoAjedrez * 8) + 2;
            //Se le suma 2 para los límites del ajedrez
        lateralAjedrez = tamanoAjedrez - 2;
            //Se le resta dos porque la variable lateralAjedrez nos ha pintado el resto

        for (int i = 0; i < tamanoAjedrez; i++) {

            for (int j = 0; j < lateralAjedrez; j++) {

                if (j == 0) {
                    System.out.print("|");
                } //DELIMITA EL TABLERO POR LA IZQUIERDA

                if (i == 0 || i == tamanoAjedrez - 1) {
                    System.out.print("-");
                    //PRIMERA Y ULTIMA VUELTA DEL AJEDREZ (DELIMITA EL TABLERO POR ARRIBA Y POR ABAJO)
                } else if (i % 2 == 0) {

                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else if (j % 2 != 0) {
                        System.out.print(" ");
                    }
                    //PRIMER PATRON DEL AJEDREZ
                } else if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else if (j % 2 != 0) {
                        System.out.print("#");
                    }
                }   //SEGUNDO PATRON DEL AJEDREZ
            }

            System.out.println("|");
            //DELIMITA EL TABLERO POR LA DERECHA
        }
    }
}
