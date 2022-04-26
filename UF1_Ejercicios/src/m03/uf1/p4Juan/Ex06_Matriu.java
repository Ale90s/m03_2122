package m03.uf1.p4Juan;

import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class Ex06_Matriu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //System.out.print("Introdueix el nombre de columnes: ");
        int columnes = entrada.nextInt();

        int[][] matriu = new int[4][columnes];
        for (int i = 0; i < columnes; ++i) {
            matriu[0][i] = 2 * (i + 1);
            matriu[1][i] = (i + 1) * (i + 1);
            matriu[2][i] = matriu[0][i] - matriu[1][i];
            matriu[3][i] = matriu[0][i] + matriu[1][i] + matriu[2][i];
        }

        // Mostra els valors de la matriu
        for (int[] fila : matriu) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println("");
        }
    }
}
