package m03.uf1.p4;

import java.util.Scanner;

public class Ex04_NombresCapicua {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine(), mitadArray = "", segundaMitadArray = "";
        String[] serieNumeros;
        int contador = 1;
        boolean capicua = false;

        serieNumeros = entrada.split("");

        /*
         *  entrada - String que recoge todos los números.
         *  
         *  serieNumeros - Es el array de los diferentes números proveniente de entrada
         *
         *  contador - contador que va aumentando para ir cogiendo los numeros del 
         *  array a la inversa
         *
         *  mitadArray - Es el que va a almacenar la primera mitad del array
         *
         *  segundaMitadArray - Es el que va a almacenar la segunda mitad del array
         *  al revés para comparar las dos mitades en los dos sentidos
         *
         *  capicua - En caso de que el número sea capicua es true
         */
        
        for (int i = 0; i < serieNumeros.length; i++) {

            // EN CASO DE QUE LA CIFRA DE NÚMEROS SEA PAR ("PARTE" EL NUMERO
            // JUSTO POR LA MITAD)
            if (i < serieNumeros.length / 2 && serieNumeros.length % 2 == 0) {
                mitadArray += serieNumeros[i];
            } else if (i >= serieNumeros.length / 2 && serieNumeros.length % 2 == 0) {
                segundaMitadArray += serieNumeros[serieNumeros.length - contador];
                contador++;
            }

            // EN CASO DE QUE LA CIFRA DE NÚMEROS SEA IMPAR, EN ESTE CASO NO
            // LEE EL NÚMERO DE EN MEDIO YA QUE ACTÚA COMO "PUNTO DE INFLEXIÓN"
            // ENTRE LAS DOS MITADES DE STRING
            if (i < serieNumeros.length / 2 && serieNumeros.length % 2 == 1) {
                mitadArray += serieNumeros[i];
            } else if (i > serieNumeros.length / 2 && serieNumeros.length % 2 == 1) {
                segundaMitadArray += serieNumeros[serieNumeros.length - contador];
                contador++;
            }
        }

        if (mitadArray.equals(segundaMitadArray)) {
            capicua = true;
        }

        if (capicua) {

            System.out.printf("El nombre té %d xifres.%n", serieNumeros.length);
            System.out.println("És capicua.");
        } else {

            System.out.printf("El nombre té %d xifres.%n", serieNumeros.length);
            System.out.println("No és capicua.");
        }
    }
}
