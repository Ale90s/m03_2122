package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_nombreOrdreCreixent {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("eng", "us"));
        Scanner in = new Scanner(System.in);
        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a <= b && a <= c && b <= c) { // c>b>a
            System.out.println(a + " <= " + b + " <= " + c);
        } else if (b <= a && b <= c && a <= c) { // c>a>b
            System.out.println(b + " <= " + a + " <= " + c);
        } else if (a <= b && a <= c && c <= b) { // b>c>a
            System.out.println(a + " <= " + c + " <= " + b);
        } else if (c <= a && c <= b && a <= b) { // b>a>c
            System.out.println(c + " <= " + a + " <= " + b);
        } else if (b <= a && b <= c && c <= a) { // a>c>b
            System.out.println(b + " <= " + c + " <= " + a);
        } else if (c <= a && c <= b && b <= a) { // a>b>c
            System.out.println(c + " <= " + b + " <= " + a);
        }
    }
}
