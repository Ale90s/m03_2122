package m03.uf1.a3;

import java.util.Scanner;

public class Ex17b_AvaluaPolinomi_decreixent {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int grado;
        double x, coeficiente, resultado, sumatorio = 0;

        System.out.printf("Introdueix grau del polinomi (>=0): ");
        grado = in.nextInt();
        System.out.printf("Introdueix el valor de la variable (x): ");
        x = in.nextDouble();

        for (int i = grado; i != -1; i--) {
            System.out.printf("Introdueix coeficient de grau %d: ", i);
            coeficiente = in.nextDouble();
            resultado = coeficiente * Math.pow(x, i);
            sumatorio = sumatorio + resultado;
        }

        System.out.printf("El valor del polinomi és: %.4f%n", sumatorio);
        
    }
}