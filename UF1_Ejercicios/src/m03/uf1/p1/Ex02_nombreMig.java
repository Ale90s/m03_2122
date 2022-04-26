package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_nombreMig {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("eng", "us"));
        Scanner in = new Scanner(System.in);
        double a, b, c;

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else if (c > a && c < b || c < a && c > b) {
            System.out.println(c);
        } else {
            System.out.println("ERROR");
        }
    }
}
