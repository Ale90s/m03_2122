package m03.uf1.p2;

import java.util.Scanner;

public class Ex08_numerosPerfectos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero, inicioSerie = 1, finalSerie = 1, sumatorioDivisores = 0;

        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {

            do {

                if (finalSerie % inicioSerie == 0 && inicioSerie != finalSerie) {

                    sumatorioDivisores += inicioSerie;

                    inicioSerie++;

                    /* 
                     * En caso de que sea divisor y no sea el mismo número, ya 
                     * que en la suma de un número perfecto no entra el propio
                     * número.Suma +1 a inicioSerie paraseguir con la serie 
                     * hasta que inicioSerie == finalSerie.
                     */
                } else if (finalSerie % inicioSerie != 0) {

                    inicioSerie++;

                    /*
                     * En caso de que no sea divisor. Suma +1 a inicioSerie para
                     * seguir con la serie hasta que inicioSerie == finalSerie.
                     */
                }

            } while (inicioSerie != finalSerie);

            if (sumatorioDivisores == finalSerie) {

                System.out.printf("%d ", sumatorioDivisores);

            }

            sumatorioDivisores = 0;
            inicioSerie = 1;
            finalSerie++;
            // Reseteo de variables.
        }
    }
}
