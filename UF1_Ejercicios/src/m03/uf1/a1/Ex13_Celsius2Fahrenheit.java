package m03.uf1.a1;

import java.util.Scanner;

public class Ex13_Celsius2Fahrenheit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Introdueix temperatura en graus Celsius:");
        celsius = in.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("La temperatura en graus Fahrenheit és: "
                + fahrenheit);

    }

}
