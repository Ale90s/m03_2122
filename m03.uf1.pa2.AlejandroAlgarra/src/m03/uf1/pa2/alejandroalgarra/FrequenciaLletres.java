package m03.uf1.pa2.alejandroalgarra;

import java.util.Locale;
import java.util.Scanner;

public class FrequenciaLletres {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        boolean letrasContadas = false;
        char letra = '@'; // SIGUIENTES LETRAS = A,B,C,D,E...
        int contador = 0, contadorLetra = 0;

        System.out.println("Introdueix una frase: ");
        String frase = in.nextLine();
        frase = frase.toUpperCase();
        // PASAMOS LA FRASE A MAYUSCULA PARA QUE NO INTERFIERA LA DIFERENCIA ENTRE MAYUSCULA
        // Y MINUSCULA

        do {

            if (contadorLetra < 26) {
                // LETRA DE LA 'A' A LA 'Z'
                letra++;
                contadorLetra++;

                for (int i = 0; i < frase.length(); i++) {

                    if (frase.charAt(i) == letra) {
                        contador++;
                    }
                }
            } else {
                // LETRA 'Ç'
                letrasContadas = true;
                letra = 'Ç';
                for (int i = 0; i < frase.length(); i++) {

                    if (frase.charAt(i) == letra) {
                        contador++;
                    }
                }

            }

            if (contador != 0) {
                System.out.printf("%c: %d%n", letra, contador);
                contador = 0;
            }
        } while (!letrasContadas);
    }
}
