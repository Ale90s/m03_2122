package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex01_arrelQuadrada {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("eng", "us"));
        Scanner in = new Scanner(System.in);
        double numero = in.nextInt();
        double raiz = Math.sqrt(numero);

        System.out.printf("%.3f", raiz);
    }
}
