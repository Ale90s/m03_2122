package m03.uf1.a3;

import java.util.Scanner;

public class Ex16a_MCD_restant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int primerNumero, segonNumero;

        System.out.print("Introdueix un nombre natural: ");
        primerNumero = in.nextInt();
        System.out.print("Introdueix un altre natural: ");
        segonNumero = in.nextInt();

        System.out.printf("El màxim comú divisor de %d i %d és:%n",
                primerNumero, segonNumero);

        do {
            if (primerNumero > segonNumero && segonNumero != 0) {
                System.out.printf("%d - %d = %d%n",
                        primerNumero, segonNumero, primerNumero - segonNumero);
                primerNumero = primerNumero - segonNumero;
            } else if (primerNumero < segonNumero && primerNumero != 0) {
                System.out.printf("%d - %d = %d%n",
                        segonNumero, primerNumero, segonNumero - primerNumero);
                segonNumero = segonNumero - primerNumero;
            }
        } while (primerNumero != segonNumero && primerNumero != 0 && segonNumero != 0);

        if (primerNumero == 0) {
            System.out.println("MCD = " + segonNumero);
        } else if (segonNumero == 0) {
            System.out.println("MCD = " + primerNumero);
        } else if (primerNumero == segonNumero) {
            System.out.println("MCD = " + primerNumero);
        }
    }
}
