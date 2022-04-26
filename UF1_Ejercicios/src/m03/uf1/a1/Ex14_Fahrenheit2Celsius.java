package m03.uf1.a1;

import java.util.Scanner;

public class Ex14_Fahrenheit2Celsius {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Introdueix temperatura en graus Fahrenheit: ");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5 / 9; //Fórmula conversión far. a cel.
        System.out.println("La temperatura en graus Celsius és: " + celsius);

    }

}
