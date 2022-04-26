package uf2_ejercicios.a2;

import java.util.*;

public class Ex02_CercaBinària {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Generamos el Array:");
        int[] array = generaArray(50, 1, 50);

        printArray(array);

        System.out.println("");
        System.out.println("");

        System.out.println("BUSCA DE FORMA SECUENCIAL");
        encuentraNumero(array, 5);

        System.out.println("");
        System.out.println("");

        System.out.println("BUSCA DE MANERA BINARIA");
        System.out.println("");

        System.out.println("Primero ordenamos el Array");
        Arrays.sort(array);
        printArray(array);

        System.out.println("");

        System.out.println("AHORA BUSCAMOS EL NUMERO CON EL METODO DE BUSQUEDA BINARIA");

        int numero = in.nextInt();

        busquedaBinaria(array, numero);

    }

    public static int[] generaArray(int posiciones, int min, int max) {

        int[] nuevaMatriz = new int[posiciones];

        for (int i = 0; i < posiciones; i++) {
            int numeroAleatorio = (int) (Math.random() * (max - min + 1) + min);
            nuevaMatriz[i] = numeroAleatorio;
        }
        return nuevaMatriz;
    }

    public static void printArray(int[] array) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.printf("%2d.", array[i]);
            } else {
                System.out.printf("%2d, ", array[i]);
                counter++;
            }
            if (counter == 5) {
                System.out.println("");
                counter = 0;
            }
        }
        System.out.println("");
    }

    public static void encuentraNumero(int[] array, int n) {

        int counter = 0, contador = 0;

        for (int i = 0; i < array.length; i++) {

            if (n == array[i]) {
                System.out.printf("Número %d en la posición %d del Array.%n", n, i);
                counter++;
                
            }
            contador++;
        }
        if (counter == 0) {
            System.out.println("No se ha encontrado el número especificado.");
        } else {
            System.out.printf("Número %d encontrado %d vez/es%n", n, counter);
        }
        System.out.println("HA DADO " + contador + " VUELTAS.");
        
    }

    public static void busquedaBinaria(int[] array, int n) {

        int indexInicio = 0, indexFinal = array.length - 1,
                indexMedio = (indexFinal + indexInicio) / 2;
        
        int contador = 0;

        while (array[indexMedio] != n) {
            if (array[indexMedio] < n) {
                indexInicio = indexMedio;
            } else {
                indexFinal = indexMedio;
            }
            indexMedio = (indexFinal + indexInicio) / 2;
            contador++;
        }

        System.out.printf("El número %d se puede encontrar en la posición %d.%n",
                array[indexMedio], indexMedio);
        System.out.println("HA DADO " + contador + " VUELTAS.");
    }
}
