package m03.uf1.pa1.alejandroalgarra;

import java.util.Scanner;

public class Cientifica {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double numero;
        int operacion;

        System.out.printf("Introdueix un nombre positiu major que zero: ");
        numero = in.nextDouble();

        do {
            System.out.printf("Operacions disponibles%n");
            System.out.printf("1 - Arrel quadrada de %.0f%n", numero);
            System.out.printf("2 - %.0f al quadrat%n", numero);
            System.out.printf("3 - %.0f al cub%n", numero);
            System.out.printf("3 - 2 elevat a %.0f%n", numero);
            System.out.printf("5 - 1/%.0f%n", numero);
            System.out.printf("Indiqui l'operació a realitzar: ");
            operacion = in.nextInt();

            switch (operacion) {
                case 1:
                    numero = Math.sqrt(numero);
                    break;
                case 2:
                    numero = Math.pow(numero, 2);
                    break;
                case 3:
                    numero = Math.pow(numero, 3);
                    break;
                case 4:
                    numero = Math.pow(2, numero);
                    break;
                case 5:
                    numero = 1/numero;
                    break;
                default:
                    System.out.printf("ERROR: opció incorrecta.%n%n");
                            break;
            }

        } while (operacion < 1 || operacion > 5);
        
        System.out.printf("%nRESULTAT: %.3f%n", numero);

    }
}
