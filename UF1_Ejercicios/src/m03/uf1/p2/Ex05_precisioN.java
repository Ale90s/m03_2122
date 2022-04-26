package m03.uf1.p2;

import java.util.Scanner;

public class Ex05_precisioN {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double e, n, sumatorioNumeroE = 1.00000, multiplicador = 1;

        n = in.nextDouble();

        for (double i = 0; i <= n; i++) {

            // En la primera vuelta (i = 0) e = 1, por lo tanto e = 1 / multiplicador,
            // que es igual a e = 1 / 1 = 1
            
            if (i >= 1) {

                for (int j = 1; j <= i; j++) {
                    multiplicador *= j; // va haciendo el "multiplicatorio" 1 * 1, 1 * 2, 2 * 3, 6 * 4...)
                }

                e = 1 / multiplicador; // fórmula número e (1/n!) = (1 + 1/1 + 1/1*2 + 1/1*2*3...)

                multiplicador = 1; // Reseteamos la variable para la siguiente vuelta.

                sumatorioNumeroE += e; // Sumatorio de las vueltas de número e (0, 1, 2, 3, 4...)
            }

        }
        
        System.out.printf("El nombre e amb precisió %.0f és: %.10f%n",
                n, sumatorioNumeroE);
        
    }
}
