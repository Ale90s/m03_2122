package m03.uf1.a1;

import java.util.Scanner;

public class Ex02_NomCognoms {
    public static void main(String[] args) {
        
        Scanner variable1 = new Scanner(System.in);
        
        System.out.print("Introduexi el seu nom: ");
        String nom = variable1.nextLine();
        System.out.print("Introduexi el seu primer cognom: ");
        String cognom1 = variable1.nextLine();
        System.out.print("Introduexi el seu segon cognom");
        String cognom2 = variable1.nextLine();
        System.out.println("El seu nom complet és: " + nom + " " + cognom1 + 
                " " + cognom2);
    }
}
