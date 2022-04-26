package m03.uf1.p3;

import java.util.Scanner;

public class Ex06_stringAsteriscos {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), palabraClave = in.nextLine();
        System.out.println("La frase modificada és:");
        for (int i = 0; i < frase.length(); i++) {
            
            if(frase.charAt(i) == '*') {
                System.out.print(palabraClave);
            } else {
                System.out.print(frase.charAt(i));
            }
        }
        System.out.println("");
    }
}
