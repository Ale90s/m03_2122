package m03.uf1.p4Juan;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jmartin
 */
public class Ex02_TrobaValorVector2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        int valor;
        String[] nombres;
        String linia;

        linia = in.nextLine();
        valor = in.nextInt();

        nombres = linia.split(" ");

        for (int i = 0; i < nombres.length - 1; i++) {
            if (valor == Integer.parseInt(nombres[i])) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");

    }
}
