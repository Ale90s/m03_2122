package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex02_Figures2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Elige un tipo de figura 2D: ");
        String figura = in.nextLine();

        switch (figura) {
            case "quadrat":
                System.out.print("Longitud del lado: ");
                int lado = in.nextInt();
                System.out.println("Perimetro: " + quadratPerimetro(lado));
                System.out.println("Superficie: " + quadratSuperficie(lado));
                break;
            case "rectangle":
                System.out.print("Longitud del rectángulo: ");
                int longitud = in.nextInt();
                System.out.print("Ancho del rectángulo: ");
                int ancho = in.nextInt();
                System.out.println("Perimetro: " + rectanglePerimetro(longitud, ancho));
                System.out.println("Superficie: " + rectangleSuperficie(longitud, ancho));
                break;
            case "triangleIsosceles":
                System.out.print("Lado desigual del triángulo isósceles: ");
                int ladoDesigual = in.nextInt();
                System.out.print("Lado repetido del triángulo isósceles: ");
                int ladoRepetido = in.nextInt();
                System.out.println("Perimetro: " + rectanglePerimetro(ladoDesigual, ladoRepetido));
                System.out.println("Superficie: " + rectangleSuperficie(ladoDesigual, ladoRepetido));
                break;
            case "cercle":
                System.out.print("Radio del circulo: ");
                int radio = in.nextInt();
                System.out.println("Perímetro: " + cerclePerimetro(radio));
                System.out.println("Superficie: " + cercleSuperficie(radio));
                break;
            default:
                System.out.println("No está registrada esa figura 2D...");
                break;
        }
    }

    public static int quadratPerimetro(int n) {
        return (n*4);
    }
    public static int quadratSuperficie(int n) {
        return (n*n);
    }
    
    public static int rectanglePerimetro(int longitud, int ancho) {
        return ((2*longitud) + (2 * ancho));
    }
    public static int rectangleSuperficie(int longitud, int ancho) {
        return (longitud * ancho);
    }

    public static int triangleIsoscelesPerimetro(int ladoDesigual, int ladoRepetido) {
        return (ladoDesigual + 2*ladoRepetido);
    }
    public static int triangleIsoscelesSuperficie(int ladoDesigual, int ladoRepetido) {

        return (int)(Math.sqrt(Math.pow(ladoRepetido, 2) - Math.pow(ladoDesigual, 2) / 4));
    }
    
    public static int cerclePerimetro(int radio) {
        return (int)(2*Math.PI*radio);
    }
    public static int cercleSuperficie(int radio) {

        return (int)(Math.PI*Math.pow(radio, 2));
    }
}
