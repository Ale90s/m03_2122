package m03.uf1.a2;

import java.util.Scanner;

public class Ex01_ParellOSenar {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;
        
        System.out.print("Introdueixi un nombre natural: ");
        numero = in.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("el nombre és parell.");
        } else {
            System.out.println("El nombre és senar.");
        }
    }
}
