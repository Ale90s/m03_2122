package m03.uf1.p4;

import java.util.Scanner;

public class Ex10_XifratRotatori {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, nFinal = 0, contador = 0, contadorFinal = 0;
        String frase;
        String[] fArray;
        String[] fArrayAux;
        
        /*
         * contador - auxiliar para cuando resto de frase o palabra >= n
         *
         * contadorFinal - auxiliar para cuando resto de frase o palabra < n
        */
        
        

        // NUMEROS QUE SE VAN A DESPLAZAR UNA CASILLA ATRAS
        do {
            n = in.nextInt();
            in.nextLine(); // Vaciamos buffer (?)
        } while (n < 1 || n > 9);

        frase = in.nextLine();
        fArray = frase.split(" ");
        fArrayAux = frase.split(" ");
        
        // EN CASO DE QUE SEA UNO QUE NO ENTRE YA QUE NO MOVERIA NADA
        if (n != 1) {
            // CAMBIO POSICION FRASES
            for (int i = 0; i < fArray.length; i++) {

                if (contador != 0) {
                    // RESTO PATRON
                    contador++;

                    if (contador == n) {
                        // ACABA PATRON
                        fArray[i] = fArrayAux[(i + 1) - contador];
                        contador = 0;
                    } else {
                        fArray[i] = fArrayAux[i + 1];
                    }

                } else if ((fArray.length) - i >= n && contador == 0) {
                    // PRIMERA FRASE PATRON
                    contador++;
                    fArray[i] = fArrayAux[i + 1];

                } else {
                    // PATRON EN CASO DE QUE LAS PALABRAS QUE SOBREN < n
                    if (i == fArray.length - 1) {

                        fArray[i] = fArrayAux[i - nFinal];
                        contadorFinal = 0;
                    } else if (contadorFinal != 0) {

                        fArray[i] = fArrayAux[i + 1];

                    } else {

                        contadorFinal++;
                        nFinal = (fArray.length - 1) - i;
                        fArray[i] = fArrayAux[i + 1];

                    }
                }

            }
        }

        for (int i = 0; i < fArray.length; i++) {

            for (int j = 0; j < fArray[i].length(); j++) {

                if (fArray[i].length() - j >= n || contador != 0) {
                    // SI RESTO FRASE >= n
                    contador++;

                    if (contador == n) {
                        System.out.print(fArray[i].charAt((j + 1) - contador));
                        contador = 0;
                    } else {
                        System.out.print(fArray[i].charAt(j + 1));
                    }
                } else {
                    // SI RESTO FRASE < n
                    contadorFinal++;

                    if (j == fArray[i].length() - 1) {
                        System.out.print(fArray[i].charAt(fArray[i].length() - contadorFinal));
                        contadorFinal = 0;
                    } else {
                        System.out.print(fArray[i].charAt(j + 1));
                    }
                }
            }
            System.out.print(" ");
        }
        System.out.println("");

    }
}
