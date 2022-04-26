package m03.uf1.a1;

import java.util.Scanner;

public class Ex05_OperacionsEnters {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int a, b, suma, resta, multiplicacio, divisio, residu;
        double divisioreal;
        
        System.out.println("Introdueix el valor enter A: ");
        a = in.nextInt();
        
        System.out.println("Introdueix el valor enter B: ");
        b = in.nextInt();
        
        suma = a+b;
        System.out.println("suma: .............................. A + B = " 
                + suma);
        resta = a-b;
        System.out.println("resta: ............................. A - B = " 
                + resta);
        multiplicacio = a*b;
        System.out.println("Multiplicació: .................... A * B = " 
                + multiplicacio);
        divisio = a/b;
        System.out.println("Quocient de la divisió entera: ... A div B = " 
                + divisio);
        residu = a%b;
        System.out.println("Residu de la divisió entera: ..... A mod B = " 
                + residu);
        divisioreal = (double) a/b;
        System.out.println("Divisió Real: ...................... A / B = " 
                + divisioreal);
        
    }

}
