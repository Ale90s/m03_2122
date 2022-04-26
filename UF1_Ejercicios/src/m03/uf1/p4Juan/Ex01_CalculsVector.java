package m03.uf1.p4Juan;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jmartin
 */
public class Ex01_CalculsVector {

    public static final int NUM = 10;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int[] valors = new int[NUM];
        int max, min, suma;
        double mitjana;

        for (int i = 0; i < NUM; ++i) {
            valors[i] = in.nextInt();
        }
        for (int i = 0; i < NUM; i++) {
            System.out.println(valors[i]);
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        suma = 0;

        for (int i = 0; i < NUM; ++i) {
            suma += valors[i];
            if (valors[i] > max) {
                max = valors[i];
            }
            if (valors[i] < min) {
                min = valors[i];
            }
        }

        System.out.printf("%.3f\n", (double) suma / NUM);
        System.out.println(max);
        System.out.println(min);
        System.out.println(suma);
    }
}
