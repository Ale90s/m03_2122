
package m03.uf1.a4;

import java.util.Scanner;

public class Ex04_PassaAMajuscules {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introdueix una frase: ");
        String frase = in.nextLine();
        System.out.printf("Frase en majúscules....: %s%n", frase.toUpperCase());
        System.out.printf("Frase original.........: %s%n", frase);
    }
}
