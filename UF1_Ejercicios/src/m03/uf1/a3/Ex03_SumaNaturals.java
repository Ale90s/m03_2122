package m03.uf1.a3;

import java.util.Scanner;

public class Ex03_SumaNaturals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero, contador = 0;
        System.out.printf("Introdueix un nombre natural: ");
        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {
            contador = contador + i;
        }
        System.out.printf("La suma dels %d primers nombres naturals és: %d%n",
                 numero, contador);
    }
}
