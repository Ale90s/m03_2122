package m03.uf1.a5;

import java.util.Scanner;

public class Ex14_MediaArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una sèrie de nombres enters ordenats:");

        String numeros = in.nextLine();
        String[] numerosArray = numeros.split(" ");

        if (numerosArray.length % 2 != 0) {
            System.out.printf("El valor de la mediana és: %s%n", numerosArray[numerosArray.length / 2]);
        } else {

            double mediana = ((Float.parseFloat(numerosArray[numerosArray.length / 2])
                    + Float.parseFloat(numerosArray[numerosArray.length / 2 - 1])) / 2);

            System.out.printf("El valor de la mediana és: %.1f%n", mediana);
        }
    }
}
