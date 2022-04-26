package m03.uf1.pa1.alejandroalgarra;

import java.util.Scanner;

public class CoolNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double centena, decena, unidad;

        System.out.print("Los nombres 'cool' Són:");

        for (int i = 100; i < 1000; i++) {

            centena = i / 100;
            decena = (i / 10) - (centena * 10);
            unidad = i - (centena * 100) - (decena * 10);
            //Separación de los numeros a unidades.

            centena = Math.pow(centena, 3);
            decena = Math.pow(decena, 3);
            unidad = Math.pow(unidad, 3);

            if (centena + decena + unidad == i) {
                System.out.printf(" %d ", i);
            }
        }
        System.out.println("");
    }
}
