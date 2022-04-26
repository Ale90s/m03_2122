package m03.uf1.p2;

import java.util.Scanner;

public class Ex06_sucessionDeFibonacci {

    public static void main(String[] args) {

        /*
        * En el programa empezamos las dos primeras vueltas del bucle
        * imprimiento 1 en pantalla, después entran en juego las variables
        * a, b y c, las cuales en bucle se van alternando realizando las sumas
        * en el orden pertinente para que dé el resultado de la sucesión
        * ORDEN -> a = b + c // b = a + c // c = a + b
        */
        
        Scanner in = new Scanner(System.in);

        int numero, a = 0, b = 1, c = 1, selector = 1;

        numero = in.nextInt();

        for (int i = 1; i <= numero; i++) {

            if (i < 3) {
                System.out.printf("1 ");
            } else {

                switch (selector) {

                    case (1):
                        a = b + c;
                        System.out.printf("%d ", a);
                        selector++;
                        break;
                    case (2):
                        b = c + a;
                        System.out.printf("%d ", b);
                        selector++;
                        break;
                    case (3):
                        c = a + b;
                        System.out.printf("%d ", c);
                        selector = 1;
                        break;
                }
            }
        }
    }
}
