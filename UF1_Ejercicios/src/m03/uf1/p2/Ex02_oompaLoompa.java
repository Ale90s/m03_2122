package m03.uf1.p2;

import java.util.Scanner;

public class Ex02_oompaLoompa {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        for (int i = 1; i <= c; i++) {

            if (i % a == 0 && i % b == 0) {
                System.out.println("Oompa-Loompa");
            } else if (i % a == 0) {
                System.out.println("Oompa");
            } else if (i % b == 0) {
                System.out.println("Loompa");
            } else {
                System.out.println(i);
            }
        }
    }
}
