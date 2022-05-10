package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex335_PiramideDeCanicas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        for (int i = 0; i < casos; i++) {

        long n = in.nextLong();
            long valor = 0;
            long aux = 0;

            for (int j = 1; j <= n; j++) {

                valor = valor + j;
                aux += valor;

            }

            System.out.println(aux);

        }
        in.close();
    }
}
