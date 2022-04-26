package m03.uf1.a2;

import java.util.Scanner;

public class Ex03_Multiples {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Introdueixi un nombre natural: ");
        numero1 = in.nextInt();
        System.out.print("Introdueixi un alter nombre natural: ");
        numero2 = in.nextInt();

        if (numero1 == 0 && numero2 == 0) {
            System.out.println("No se contempla multiplicar 0x0");
        } else if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("un d'ells és múltiple de l'altre");
        } else {
            System.out.println("Cap d'ells és múltiple de l'altre");
        }
    }
}
