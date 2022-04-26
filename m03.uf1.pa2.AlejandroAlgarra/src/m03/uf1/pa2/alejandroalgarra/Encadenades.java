package m03.uf1.pa2.alejandroalgarra;

import java.util.Scanner;

public class Encadenades {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix una llista de paraules encadenades");
        String frase = in.nextLine();
        char anterior = 0, siguiente = 0;
        boolean isEncadenada = true;

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == ' ') {
                
                // COGEMOS CARACTER DE ANTES Y DESPUES DEL ESPACIO Y COMPARAMOS
                anterior = frase.charAt(i - 1);
                siguiente = frase.charAt(i + 1);

                if (anterior != siguiente) {
                    // SI UNA DE LAS PALABRAS NO ES ENCADENADA DE LA SIGUIENTE 
                    // NO SE CONSIDERA LA FRASE
                    isEncadenada = false;
                }
            }
        }

        if (isEncadenada) {

            System.out.println("Sí és una llista de paraules encadenades");

        } else {

            System.out.println("No és una llista de paraules encadenades");

        }
    }
}
