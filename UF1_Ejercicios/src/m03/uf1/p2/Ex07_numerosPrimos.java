package m03.uf1.p2;

import java.util.Scanner;

public class Ex07_numerosPrimos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nNumerosPrimos, divisible = 0, pruebaInicioNumero = 1, pruebaFinalNumero = 2;

        nNumerosPrimos = in.nextInt();

        for (int i = 0; i < nNumerosPrimos; i++) {

            do {

                if (pruebaInicioNumero == pruebaFinalNumero + 1 && divisible != 2) {

                    pruebaFinalNumero++;
                    pruebaInicioNumero = 1;
                    divisible = 0;

                } // En caso de que el número no sea primo.

                if (pruebaFinalNumero % pruebaInicioNumero == 0) {

                    divisible++;
                    pruebaInicioNumero++;
                    // En caso de que el número sea divisible.

                } else if (pruebaFinalNumero % pruebaInicioNumero != 0) {

                    pruebaInicioNumero++;
                    /*
                    *  En caso de que el número no sea divisible. Suma 1 a 
                    *  pruebaInicioNumero para testear siguientes números.
                     */
                }
                
            } while (divisible != 2 || pruebaInicioNumero != pruebaFinalNumero + 1);

            /*
             * En caso de que solo sea divisible entre dos números y 
             * pruebaInicioNumero sea igual a pruebaFinalNumero + 1 sale del 
             * bucle doWhile. Se suma 1 a la pruebaFinalNumero ya que en la 
             * última vuelta se suma 1 a la pruebaInicioNumero.
             */
            if (i == nNumerosPrimos - 1) {

                System.out.printf("%d.%n", pruebaFinalNumero);
                // En la última vuelta imprime un punto.

            } else if (i < nNumerosPrimos) {

                System.out.printf("%d, ", pruebaFinalNumero);

            }

            pruebaFinalNumero++;
            pruebaInicioNumero = 1;
            divisible = 0;

        }
    }
}
