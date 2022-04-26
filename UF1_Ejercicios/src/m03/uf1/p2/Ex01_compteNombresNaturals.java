package m03.uf1.p2;

import java.util.Scanner;

public class Ex01_compteNombresNaturals {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, multiplicador, sumatorio;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        multiplicador = b / c;

        for (int i = 0; i <= multiplicador; i++) {

            sumatorio = a + c * i;

            if (sumatorio <= b) {
                System.out.printf("%d ", sumatorio);
            }
        }
    }
}
