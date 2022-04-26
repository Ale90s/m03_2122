package m03.uf1.a2;

import java.util.Scanner;

public class Ex02_MultipleDe7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        System.out.print("Introdueixi el nombre natural: ");
        numero = in.nextInt();

        if (numero % 7 == 0) {
            System.out.println("El nombre és múltiple de 7.");
        } else {
            System.out.println("El nombre NO és múltiple de 7.");
        }
    }
}
