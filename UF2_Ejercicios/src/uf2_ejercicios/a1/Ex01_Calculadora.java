package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex01_Calculadora {

    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        System.out.print("Elige una operación a realizar: ");
        String operacion = in.nextLine();
        System.out.print("Numero 1 para operar: ");
        int n1 = in.nextInt();
        System.out.print("Número 2 para operar: ");
        int n2 = in.nextInt();

        switch (operacion) {
            case "suma":
                System.out.println(suma(n1, n2));
                break;
            case "resta":
                System.out.println(resta(n1, n2));
                break;
            case "multiplicacio":
                System.out.println(multiplicacio(n1, n2));
                break;
            case "divisio":
                System.out.println(divisio(n1, n2));
                break;
            default:
                System.out.println("Operación invalida...");
                break;
        }
    }
    public static int suma(int n1, int n2) {
        return n1 + n2;
    }
    public static int resta(int n1, int n2) {
        return n1 - n2;
    }
    public static int multiplicacio(int n1, int n2) {
        return n1 * n2;
    }
    public static double divisio(double n1, double n2) {
        return n1 / n2;
    }
}
