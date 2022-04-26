package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex08_Divisio {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "us"));
        Scanner in = new Scanner(System.in);
        float quocient, divisor, resultat;

        quocient = in.nextFloat();
        divisor = in.nextFloat();
        resultat = quocient / divisor;
        if (divisor == 0) {
            System.out.println("Infinit");
        } else {
            System.out.printf("%.1f%n", resultat);
        }
    }
}
