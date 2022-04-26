package m03.uf1.p4Juan;

import java.util.Scanner;

public class Ex07_QuadratMagic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final int MIN = 3, MAX = 21;
        int dimensio = 0;
        boolean entradaCorrecta = false;
        while (!entradaCorrecta) {
            /*System.out.print("Introdueixi la dimensió del quadrat màgic " + 
		                                  "(senar entre " + MIN  + " i  " + MAX + "): ");*/
            if (entrada.hasNextInt()) {
                dimensio = entrada.nextInt();
                if (dimensio >= MIN && dimensio <= MAX && (dimensio % 2) != 0) {
                    entradaCorrecta = true;
                }
            } else {
                entrada.next();
            }
        }
        entrada.close();

        int[][] quadratMagic = new int[dimensio][dimensio];

        // Posició inicial
        int fila = 0, columna = dimensio / 2;
        int valor = 1;
        for (int i = 0; i < dimensio; ++i) {
            for (int j = 0; j < dimensio; ++j) {
                quadratMagic[fila][columna] = valor;
                fila = (fila > 0) ? (fila - 1) : (dimensio - 1);
                columna = (columna + 1) % dimensio;

                ++valor;
            }

            columna = (columna > 0) ? (columna - 1) : (dimensio - 1);
            fila = (fila + 2) % dimensio;
        }

        // Mostrar el resultat
        for (int i = 0; i < dimensio; ++i) {
            for (int j = 0; j < dimensio; ++j) {
                System.out.printf("%" + (int) (Math.log10(valor - 1) + 1) + "d", quadratMagic[i][j]);
                if (j < dimensio - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
