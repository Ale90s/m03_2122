package m03.uf1.a2;

import java.util.Scanner;

public class Ex05_DosNombresCreixents {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero1, numero2;

        System.out.printf("Introdueix un nombre enter: ");
        numero1 = in.nextInt();
        System.out.print("Introdueix un altre enter: ");
        numero2 = in.nextInt();

        if (numero1 < numero2) {
            System.out.printf("Els teus nombres en ordre creixen són; %d, %d%n"
                    , numero1, numero2);
        } else if (numero2 < numero1) {
            System.out.printf("Els teus nombres en ordre creixen són: %d, %d%n"
                    , numero2, numero1);
        }
    }
}
