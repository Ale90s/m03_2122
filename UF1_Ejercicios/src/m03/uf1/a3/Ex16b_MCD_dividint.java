package m03.uf1.a3;

import java.util.Scanner;

public class Ex16b_MCD_dividint {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int primerNumero, segonNumero;

        System.out.print("Introdueix un nombre natural: ");
        primerNumero = in.nextInt();
        
        System.out.print("Introdueix un altre natural: ");
        segonNumero = in.nextInt();

        System.out.printf("El màxim comú divisor de %d i %d és:%n",
                primerNumero, segonNumero);
        
        if (primerNumero != 0 && segonNumero != 0) {
            do {

                System.out.printf("%d %% %d = %d%n",
                        primerNumero, segonNumero, primerNumero % segonNumero);
                if (primerNumero % segonNumero != 0) {
                    primerNumero = primerNumero % segonNumero;
                }
                
                System.out.printf("%d %% %d = %d%n",
                        segonNumero, primerNumero, segonNumero % primerNumero);
                if (segonNumero % primerNumero != 0) {
                    segonNumero = segonNumero % primerNumero;
                }

            } while (primerNumero % segonNumero != 0 && segonNumero % primerNumero != 0);
        }
        
        if (primerNumero > segonNumero && segonNumero != 0) {
            System.out.printf("MCD = %d.%n", segonNumero);
        } else if (primerNumero < segonNumero && primerNumero != 0) {
            System.out.printf("MCD = %d.%n", primerNumero);
        } else if (primerNumero != 0 && segonNumero == 0) {
            System.out.printf("MCD = %d.%n", primerNumero);
        } else if (primerNumero == 0 && segonNumero != 0) {
            System.out.printf("MCD = %d.%n", segonNumero);
        }
    }
}
