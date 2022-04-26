package m03.uf1.p3;

import java.util.Scanner;

public class Ex04_fraseAlReves {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), fraseAlReves = null;
        
        System.out.print("La cadena a l'inrevés és: ");
        
        for (int i = frase.length(); i > 0; i--) {
            System.out.print(frase.charAt(i - 1));
        }
        System.out.println("");
    }
}