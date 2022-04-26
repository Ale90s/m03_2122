package m03.uf1.a3;

import java.util.Scanner;

public class Ex13_TaulaDivisioEntera {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;
        boolean numeroCorrecto = true;
        //Utilizamos un boolean para decidir en cualquier sitio cuando se repite el bucle.
        do {
            System.out.print("Introdueixi un nombre natural: ");

            try {
                numero = in.nextInt();

                if (numero < 0) {
                    System.out.println("ERROR: el valor no és correcte.");
                } else {
                    for (int i = 1; i <= 10; i++) {
                        System.out.printf("%d dividit per %2d dona: quocient = %2d i residu = %d%n",
                                numero, i, numero / i, numero % i);
                    }
                    numeroCorrecto = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR: el valor no és correcte.");
                numeroCorrecto = false;
                System.out.println(numeroCorrecto);
                in.nextLine();
            }
        } while (numeroCorrecto == false);

        in.nextLine();
        System.out.println("");
        System.out.print("Prem ENTER per acabar...");
        in.nextLine();
    }
}
