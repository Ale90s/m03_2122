package m03.uf1.a1;

import java.util.Scanner;

public class Ex06_EquacioSegonGrau {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double a, b, c, primera, segona;
        
        System.out.println("Introdueix els coeficients de"
                + " l'equació de segon grau");
        
        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();
        System.out.print("c = ");
        c = in.nextInt();
        
        primera = ((-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));
        System.out.printf("La primera solució de l'equació es x1 =  %f%n&3"
                , primera);
        segona = ((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a));
        System.out.println("La segona solució de l'equació és x2 =  " + segona);
       
    }
    
}
