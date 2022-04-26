package uf2_ejercicios.p1.a1;

import java.util.Scanner;

public class Ex04_Figuras3D {

    public static void main(String[] args) {
        
        printFiguras();
    }
    
    public static double superficie(String tipo, double a, double b) {
        
        switch(tipo) {
            case "c":
                return (2 * Math.PI * a * b ) + (2 * Math.PI * Math.pow(a, 2));
            case "h":
                return 6 * Math.pow(a, 2);// HEXAEDRE - a = costat
            case "t":
                return Math.sqrt(3) * Math.pow(a, 2);// TETAEDRE - a = aresta
            case "e":
                return 4 * Math.PI * Math.pow(a, 2);// ESFERA - a = radi
            default:
                return 0;
        }
    }
    
    public static double volum(String tipo, double a, double b) {
        
        switch(tipo) {
            case "c":
                return Math.PI * Math.pow(a, 2) * b; // CILINDRE - a = radi , b = alçada
            case "h":
                return Math.pow(a, 3);// HEXAEDRE - a = costat
            case "t":
                return Math.pow(a, 3) / (6 * Math.sqrt(2)); // TETAEDRE - a = aresta
            case "e":
                return 4 * Math.PI * Math.pow(a, 3) / 3;// ESFERA - a = radi
            default:
                return 0;
        }
    }
    
    public static void printFiguras() {
        Scanner in = new Scanner(System.in);
        String figura;
        
        do {
            figura = in.nextLine().toLowerCase();
            double a, b;
            switch(figura) {
            case "c":
                System.out.println("==Cilindre==");
                System.out.printf("Superfície: %.2f%n", superficie(figura, a = in.nextDouble(), b = in.nextDouble()));
                System.out.printf("Volum: %.2f%n", volum(figura, a, b));
                break;
            case "h":
                System.out.println("==Hexaedre==");
                System.out.printf("Superfície: %.2f%n", superficie(figura, a = in.nextDouble(), 0));
                System.out.printf("Volum: %.2f%n", volum(figura, a, 0));
                break;
            case "t":
                System.out.println("==Tetraedre==");
                System.out.printf("Superfície: %.2f%n", superficie(figura, a = in.nextDouble(), 0));
                System.out.printf("Volum: %.2f%n", volum(figura, a, 0));
                break;
            case "e":
                System.out.println("==Esfera==");
                System.out.printf("Superfície: %.2f%n", superficie(figura, a = in.nextDouble(), 0));
                System.out.printf("Volum: %.2f%n", volum(figura, a, 0));
                break;
            default:
                break;
            }  
        } while(!figura.equals("s"));
    }
}
