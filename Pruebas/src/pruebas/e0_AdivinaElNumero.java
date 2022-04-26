package pruebas;

import java.util.Scanner;

public class e0_AdivinaElNumero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor;

        System.out.print("Advina un número...");
        valor = in.nextInt();
        
        do {
            if (valor == 20) {
                System.out.println("Lo has adivinado");
            } else {
                System.out.println("Has fallado :(");
            }
            if (valor != 20) {
                valor = in.nextInt();
            }
        } while (valor != 20);
        
    }
}
