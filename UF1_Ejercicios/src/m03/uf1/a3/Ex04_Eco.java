package m03.uf1.a3;

import java.util.Scanner;

public class Ex04_Eco {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String montoya;
        int repeticion;

        System.out.printf("Escriu una frase: ");
        montoya = in.nextLine();

        System.out.printf("Quants cops vols repetir-la? ");
        repeticion = in.nextInt();

        for (int i = 1; i <= repeticion; i++) {
            System.out.printf("%d - %s%n", i, montoya);
        }
    }
}
