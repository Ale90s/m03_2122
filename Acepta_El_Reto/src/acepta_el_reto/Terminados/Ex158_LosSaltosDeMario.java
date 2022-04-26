package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex158_LosSaltosDeMario {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int casos = in.nextInt(), nSaltos, n1 = 0, n2, arriba = 0, abajo = 0;

        for (int i = 0; i < casos; i++) {

            nSaltos = in.nextInt();

            arriba = 0;
            abajo = 0;
            
            for (int j = 0; j < nSaltos; j++) {

                n2 = n1;
                n1 = in.nextInt();

                if (j != 0) {

                    if (n1 > n2) {
                        arriba++;
                    } else if (n1 < n2) {
                        abajo++;
                    }
                }
            }
            System.out.printf("%d %d%n", arriba, abajo);
        }
    }
}
