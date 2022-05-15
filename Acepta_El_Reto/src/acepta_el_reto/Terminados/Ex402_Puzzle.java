package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex402_Puzzle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, lado;

        n = in.nextInt();

        while (n != 0) {

            lado = (int) Math.sqrt(n);

            if (n % lado == 0) {
                System.out.println(n / lado);
            } else {
                do {
                    lado--;
                } while (n % lado != 0);
                System.out.println(n / lado);
            }
            n = in.nextInt();
        }
        in.close();
    }
}