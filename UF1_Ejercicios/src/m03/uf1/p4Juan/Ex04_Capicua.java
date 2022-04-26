package m03.uf1.p4Juan;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author jmartin
 */
public class Ex04_Capicua {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);
        long numero = -1;
        int[] vectorNumeros;
        int xifres;
        boolean capicua;

        if (!in.hasNextLong()) {
            System.out.println("Invàlid");
        } else {
            numero = in.nextLong();
            xifres = String.valueOf(numero).length();
            vectorNumeros = new int[xifres];
            System.out.printf("El nombre té %d xifres.%n", xifres);

            for (int i = 0; i < xifres; i++) {
                vectorNumeros[xifres - 1 - i] = (int) (numero % 10);
                numero /= 10;
            }

            capicua = true;
            for (int i = 0; i < xifres / 2 && capicua; i++) {
                capicua = vectorNumeros[i] == vectorNumeros[xifres - 1 - i];
            }

            if (capicua) {
                System.out.println("És capicua.");
            } else {
                System.out.println("No és capicua.");
            }
        }
    }
}
