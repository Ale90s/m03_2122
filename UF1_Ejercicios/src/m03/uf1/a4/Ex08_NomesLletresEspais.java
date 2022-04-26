package m03.uf1.a4;

import static java.lang.Character.isLetter;
import java.util.Scanner;

public class Ex08_NomesLletresEspais {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase;
        char caracter;
        
        System.out.println("Introdueix una cadena:");
        frase = in.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);
            if (isLetter(caracter)) {
                System.out.print(caracter);
            } else if(caracter == ' ') {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
