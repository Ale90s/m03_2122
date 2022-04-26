package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex09_Calculadora {
    public static void main (String[] args) {
        
        Locale.setDefault(new Locale("en", "us"));
        Scanner in = new Scanner(System.in);
        double a, b, suma, resta, multiplicacion, division;
        String operacio;
        
        a = in.nextDouble();
        operacio = in.next();
        b = in.nextDouble();
        
        switch (operacio) {
            case "+":
                suma = a+b;
                System.out.printf("%.2f%n",suma);
                break;
            case "-":
                resta = a-b;
                System.out.printf("%.2f%n",resta);
                break;
            case "*":
                multiplicacion = a*b;
                System.out.printf("%.2f%n",multiplicacion);
                break;
            case "/":
                division = a/b;
                System.out.printf("%.2f%n",division);
                break;
            default:
                System.out.println("Operació incorrecta.");
                break;
        }
    }
}
