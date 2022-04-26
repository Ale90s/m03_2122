package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex04_Menu {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean seguir = true;
        
        do {
            System.out.println("Elige ej. O sal 1 = calculadora, 2 = salir.");
            int n = in.nextInt();
            
            switch(n) {
                case 1:
                    Ex01_Calculadora.main(args);
                    break;
                case 2:
                    seguir = false;
                    break;
            }
            
            
        } while (seguir);
    }
    
}
