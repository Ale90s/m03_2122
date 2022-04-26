package m03.uf1.a1;

import java.util.Scanner;

public class Ex04_Circumferencia {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int radi;
        double longitud, area, volum;
        
        System.out.print("Introdueixi el radi de la circumferència:");
        radi = in.nextInt();
        
        System.out.println("");
        
        longitud = 2*Math.PI*radi;
        System.out.printf("La seva longitud és:      %.3f%n", longitud);
        // el %.3f indica que va a tener 3 decimales máximo y f porque es un double
        area = Math.PI*Math.pow(radi, 2);
        System.out.printf("L'àrea del cercle és:     %.3f%n", area);
        
        volum = (4*Math.PI*Math.pow(radi, 3))/3;
        System.out.printf("El volum de l'esfera és:  %.3f%n", volum);
    }
    
}
