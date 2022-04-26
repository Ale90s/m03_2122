
package m03.uf1.a4;

import java.util.Scanner;

public class Ex02_CercaText {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String primera, segunda;
        
        System.out.println("Introdueix una frase:");
        primera = in.nextLine();
        System.out.println("Introdueix una altra frase:");
        segunda = in.nextLine();
        
        if (primera.contains(segunda)) {
            System.out.println("La primera frase conté la segona.");
        } else {
            System.out.println("La primera frase NO conté la segona.");
        }
        
    }
}
