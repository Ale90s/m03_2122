package m03.uf1.p3;

import java.util.Scanner;

public class Ex07_contadorPepes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), fraseSubStrings;
        int contadorPepes = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'p') {
                //Condicional para hacer más eficiente el programa

                if (i + 4 <= frase.length()) {
                    /*
                    Condicional para que no intente hacer un subString de un
                    String que no tendría el largo suficiente ("petaría el
                    programa")
                     */
                    fraseSubStrings = frase.substring(i, i + 4);

                    if (fraseSubStrings.equals("pepe")) {
                        contadorPepes++;
                    }
                }
            }
        }
        System.out.printf("La frase conté %d cops la seqüència \"pepe\".%n",
                contadorPepes);
    }
}
