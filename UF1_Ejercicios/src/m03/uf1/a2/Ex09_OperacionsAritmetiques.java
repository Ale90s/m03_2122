package m03.uf1.a2;

import java.util.Scanner;

public class Ex09_OperacionsAritmetiques {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;
        String operacion;
        
        
        System.out.print("Introdueix un número:");
        x = entrada.nextInt();
        System.out.print("Introdueix un altre:");
        y = entrada.nextInt();
        
        System.out.print("Introdueix una operació (+,-,*,/):");
        operacion = entrada.next();
        
        switch (operacion) {
            case "+":
                System.out.println("El resultat de l'operació és:"
                + " " + x + " " + operacion + " " + y + " = " + x+y);
                    break;
            case "-":
                System.out.println("El resultat de l'operació és:"
                + " " + x + " " + operacion + " " + y + " = " + (x-y));
                    break;  //¿Por qué tengo que meter la operación esta en concreto dentro de un paréntesis?
            case "*":
                System.out.println("El resultat de l'operació és:"
                + " " + x + " " + operacion + " " + y + " = " + x*y);
                    break;
            case "/":
                System.out.println("El resultat de l'operació és:"
                + " " + x + " " + operacion + " " + y + " = " + x/y);
                    break;
            default:
                System.out.println("Operació incorrecta!");
        }
    }
}
