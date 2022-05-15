package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex405_ImprimiendoPaginasSueltas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b, c, d;

        do {
            a = in.nextInt();
            if (a <= 0) {
                break;
            }
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            in.nextInt();

            if (a + 1 == b) {
                if (b + 1 == c) {
                    if (c + 1 == d) {
                        System.out.printf("%d-%d%n", a, d);
                    } else {
                        System.out.printf("%d-%d,%d%n", a, c, d);
                    }
                } else {
                    if (c + 1 == d) {
                        System.out.printf("%d-%d,%d-%d%n", a, b, c, d);
                    } else {
                        System.out.printf("%d-%d,%d,%d%n", a, b, c, d);
                    }
                    
                }
            } else if (b + 1 == c) {
                if (c + 1 == d) {
                    System.out.printf("%d,%d-%d%n", a, b, d);
                } else {
                    System.out.printf("%d,%d-%d,%d%n", a, b, c, d);
                }
            } else if (c + 1 == d) {
                System.out.printf("%d,%d,%d-%d%n", a, b, c, d);
            } else {
                System.out.printf("%d,%d,%d,%d%n", a, b, c, d);
            }
        } while (true);
        in.close();
    }
}
