package m03.uf1.p3;

import java.util.Scanner;

public class Ex02_palindromo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), fraseSinEspacios = "", fraseAlReves = "";
        
        //PASAMOS LA FRASE A MINUSCULA
        frase = frase.toLowerCase();
        
        //PRIMERO QUITAMOS LOS ESPACIOS (USAMOS VARIABLE AUXILIAR)
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fraseSinEspacios += frase.charAt(i);
            }
        }
        //COPIAMOS LA FRASE AL REVES EN OTRA VARIABLE AUXILIAR
        for (int i = fraseSinEspacios.length(); i > 0; i--) {
            fraseAlReves += fraseSinEspacios.charAt(i - 1);
        }
        //SI SON IGUALES SON PALINDROMOS, EN CASO CONTRARIO NO
        if (fraseSinEspacios.equals(fraseAlReves)) {
            System.out.println("La cadena és un palíndrom.");
        } else {
            System.out.println("La cadena NO és un palíndrom.");
        }
    }
}
