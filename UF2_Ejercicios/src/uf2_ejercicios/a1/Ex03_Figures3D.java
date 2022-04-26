package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex03_Figures3D {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Elige una figura 3D: ");
        String figura = in.nextLine();
        
        if (existeFigura(figura)) {
            System.out.print("Indica el radio/lado: ");
            double n1 = in.nextDouble();

            double perimetro = perimetro(figura, n1);
            double superficie = superficie(figura, n1);
            displayPerimetro(figura, perimetro);
            displaySuperficie(figura, superficie);
        } else {
            System.out.println("La figura indicada no existe...");
        }
        
        
    }

    public static double perimetro(String s,double n1) {
        
        switch (s) {
            case "cilindre":
                return (2*Math.PI*n1);
            case "hexaedre":
                return (12*n1);
            case "tetraedre":
                return (Math.sqrt(3) * Math.pow(n1, 2));
            case "esfera":
                return (4 * Math.PI * Math.pow(n1, 2));
            default:
                return -1;
        }
    }

    public static double superficie(String s,double n1) {

        switch (s) {
            case "cilindre":
                return (2*Math.PI*Math.pow(n1, 2));
            case "hexaedre":
                return (6*Math.pow(n1, 2));
            case "tetraedre":
                return ((Math.sqrt(2) * Math.pow(n1, 3)) / 12);
            case "esfera":
                return ((4 * Math.PI * Math.pow(n1, 3)) / 3);
            default: 
                return -1;
        }
    }
    
    public static void displayPerimetro (String s,double n1) {
        
        System.out.println("El perímetro del "+ s + " es: " + n1);
    }
    
    public static void displaySuperficie (String s, double n1) {
        
        System.out.println("La superficie del "+ s + " es: " + n1);
    }
    
    public static boolean existeFigura (String s) {
        
        switch (s) {
            case "cilindre":
            case "hexaedre":
            case "tetraedre":
            case "esfera":
                return true;
            default: 
                return false;
        }
    }
}