package m03.uf1.p4Juan;

import java.util.Scanner;

/**
 *
 * @author jmartin
 */
public class Ex03_FrequenciesNotes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] frequenciaNotes = new int[11];
        int nota;

        nota = in.nextInt();

        while (nota >= 0 && nota <= 10) {
            frequenciaNotes[nota]++;
            nota = in.nextInt();
        }

        for (int i = 0; i < frequenciaNotes.length; ++i) {
            System.out.printf("%d%n", frequenciaNotes[i]);
        }
    }
}
