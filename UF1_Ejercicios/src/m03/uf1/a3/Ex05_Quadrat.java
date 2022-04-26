package m03.uf1.a3;

import java.util.Scanner;

public class Ex05_Quadrat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int amplada, alcada;
        char quadrat = '*';

        System.out.print("Introdueix l'amplada del rectangle: ");
        amplada = in.nextInt();
        System.out.print("Introdueix l'alçada del rectangle: ");
        alcada = in.nextInt();

        for (int i = 0; i < alcada; i++) {
            for (int j = 1; j < amplada; j++) {
                System.out.print(quadrat);
            }
            System.out.println(quadrat);
        }
        System.out.println("");

    }
}
