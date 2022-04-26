package m03.uf1.p4;

import java.util.Scanner;

public class Ex01_CalculsVector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeros[] = new int[10];
        int suma = 0, max, min;

        for (int i = 0; i < numeros.length; i++) {

            
            numeros[i] = in.nextInt();
        }

        max = numeros[0];
        min = numeros[0];


        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("%d%n", numeros[i]);

            suma += numeros[i];

            if (max < numeros[i]) {
                max = numeros[i];
            }
            if (min > numeros[i]) {
                min = numeros[i];
            }
        }
        System.out.printf("%.3f%n", ((double)suma / numeros.length));
        System.out.printf("%d%n", max);
        System.out.printf("%d%n", min);
        System.out.printf("%d%n", suma);
    }
}
