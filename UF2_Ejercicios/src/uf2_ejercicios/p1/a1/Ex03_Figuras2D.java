package uf2_ejercicios.p1.a1;

import java.util.Scanner;

public class Ex03_Figuras2D {

    public static void main(String[] args) {
        
        printFiguras();
    }
    
    public static double perimetre(String tipo, double a, double b) {
        
        switch(tipo) {
            case "q":
                
                return 4*a; // CUADRADO - a = lado
            case "c":
                return 2*Math.PI*a; // CIRCULO - a = radio
            case "r":
                return 2*(a + b); // RECTANGULO - a = un lado , b = otro lado
            case "t":
                return (2*a)+b ; // TRIANGULO - a = base , b = altura
            default:
                return 0;
        }
    }
    
    public static double superficie(String tipo, double a, double b) {
        
        switch(tipo) {
            case "q":
                return Math.pow(a, a); // CUADRADO - a = lado
            case "c":
                return Math.PI*Math.pow(a, 2); // CIRCULO - a = radio
            case "r":
                return a*b; // RECTANGULO - a = un lado , b = otro lado
            case "t":
                return (b * Math.sqrt(Math.pow(a,2) - ((Math.pow(b,2)/4))))/2;
                                        // TRIANGULO - a = base , b = altura
            default:
                return 0;
        }
    }
    
    public static void printFiguras() {
        Scanner in = new Scanner(System.in);
        String figura = "";
        
        do {
            figura = in.nextLine().toLowerCase();
            double a, b;
            switch(figura) {
            case "q":
                System.out.println("==Quadrat==");
                System.out.printf("Perímetre : %.2f%n", perimetre(figura, a = in.nextDouble(), 0));
                System.out.printf("Superfície: %.2f%n", superficie(figura, a, 0));
                break;
            case "c":
                System.out.println("==Cercle==");
                System.out.printf("Perímetre : %.2f%n", perimetre(figura, a = in.nextDouble(), 0));
                System.out.printf("Superfície: %.2f%n", superficie(figura, a, 0));
                break;
            case "r":
                System.out.println("==Rectangle==");
                System.out.printf("Perímetre : %.2f%n", perimetre(figura, a = in.nextDouble(), b = in.nextDouble()));
                System.out.printf("Superfície: %.2f%n", superficie(figura, a, b));
                break;
            case "t":
                System.out.println("==Triangle isòsceles==");
                System.out.printf("Perímetre : %.2f%n", perimetre(figura, a = in.nextDouble(), b = in.nextDouble()));
                System.out.printf("Superfície: %.2f%n", superficie(figura, a, b));
                break;
            default:
                break;
        }
            
        } while(!figura.equals("s"));
    }
}
