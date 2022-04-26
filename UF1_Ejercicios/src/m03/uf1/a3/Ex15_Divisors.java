package m03.uf1.a3;

import java.util.Scanner;

public class Ex15_Divisors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroNatural, resto;

        System.out.print("Introdueixi un nombre natural: ");
        numeroNatural = in.nextInt();

        for (int i = 1; i <= numeroNatural; i++) {
            resto = numeroNatural % i;
            
            if (i == numeroNatural) {
                System.out.println(i + ".");
            } else if (resto == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
