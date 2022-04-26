package m03.uf1.a3;

import java.util.Scanner;

public class Ex06_MenorQue100 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        do {
            System.out.printf("Introdueix un nombre (>=100 per acabar): ");
            numero = in.nextInt();
        } while (numero < 100);

        System.out.printf("Acabat! el darrer nombre introduït és: %d%n", numero);
    }
}
