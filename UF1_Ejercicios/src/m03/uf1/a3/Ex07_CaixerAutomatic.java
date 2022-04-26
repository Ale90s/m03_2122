package m03.uf1.a3;

import java.util.Scanner;

public class Ex07_CaixerAutomatic {

    public static final int PIN_TARGETA = 5555;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pin;

        System.out.printf("BENVINGUDA/BENVINGUT AL BANC COPERNIC.%n");
        System.out.printf("INSEREIX EL PIN: ");
        pin = in.nextInt();

        if (pin != PIN_TARGETA) {

            for (int i = 0; i < 2; i++) {
                System.out.println("PIN INCORRECTE. PROVA DE NOU.");
                System.out.print("INSEREIX EL PIN: ");
                pin = in.nextInt();
                if (pin == PIN_TARGETA) {
                    i = 2;
                }
            }
        }
        if (pin == PIN_TARGETA) {
            System.out.println("PIN CORRECTE. SELECCIONI L'OPERACIÓ"
                    + " A REALITZAR...");
        } else {
            System.out.println("HA ARRIBAT AL NOMBRE MÀXIM D’INTENTS. "
                    + "TARGETA RETINGUDA.");
            System.out.println("POSI'S EN CONTACTE AMB EL PERSONAL DE"
                    + " L'OFICINA.");
        }
    }
}
