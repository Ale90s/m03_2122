package m03.uf1.p4Juan;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author jmartin
 */
public class Ex05_BitlletsIMonedes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int[] valors = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50,
            20, 10, 5, 2, 1};
        int diners;
        diners = (int) (entrada.nextDouble() * 100);
        for (int i = 0; i < valors.length; i++) {
            int num = diners / valors[i];
            if (i < 7) {
                System.out.printf("Bitllets de %3d €: %d%n", valors[i] / 100, num);
            } else if (i < 9) {
                System.out.printf("Monedes de %4d €: %d%n", valors[i] / 100, num);
            } else {
                System.out.printf("Monedes de %3.2f €: %d%n", valors[i] / 100.0, num);
            }
            diners -= num * valors[i];
        }
    }
}
