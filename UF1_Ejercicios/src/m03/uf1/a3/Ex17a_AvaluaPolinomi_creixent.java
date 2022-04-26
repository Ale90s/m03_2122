package m03.uf1.a3;

import java.util.Scanner;

public class Ex17a_AvaluaPolinomi_creixent {
    
    public static void main (String[] args) {
        
        Scanner in = new Scanner(System.in);
        int grado;
        double x, coeficiente, resultado, sumatorio = 0;
        
        System.out.printf("Introdueix grau del polinomi (>=0): ");
        grado = in.nextInt();
        System.out.printf("Introdueix el valor de la variable (x): ");
        x = in.nextDouble();
        
        for (int i = 0; i <= grado; i++) {
            System.out.printf("Introdueix coeficient de grau %d: ", i);
            coeficiente = in.nextDouble();
            resultado = coeficiente * Math.pow(x, i);
            sumatorio = sumatorio + resultado;
        }
        
        System.out.printf("El valor del polinomi és: %.4f%n", sumatorio);
        
    }
}
