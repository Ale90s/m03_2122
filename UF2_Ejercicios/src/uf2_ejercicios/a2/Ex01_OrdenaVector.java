package uf2_ejercicios.a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01_OrdenaVector {

    public static void main(String[] args) {

        int array[] = generaVector(10); // {6,5,4,3,2,1}
        System.out.println("VECTOR DESORDENADO");
        mostraVector(array);

        System.out.println("ORDENAR ALGORITMO SELECCIÓN");
        ordenaSeleccio(array);

        array = generaVector(10);

        System.out.println("ORDENAR ALGORITMO BURBUJA");
        ordenaBombolla(array);

        array = generaVector(10);

        System.out.println("ORDENAR CLASE Collections MÉTODO sort");
        Arrays.sort(array);
        mostraVector(array);

        System.out.println("ORDENAR CLASE CON Listas COLLECTIONS.SORT");

        List<Integer> a = new ArrayList<>();

        
        
        for (int i = 0; i < array.length; i++) {
            a.add(array[i]);
        }
        Collections.sort(a);
        System.out.println(a);
        
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);
        System.out.println(a.get(2));
    }

    public static int[] generaVector(int numElements) {

        int array[] = new int[numElements];
        int aux = numElements;

        for (int i = 0; i < numElements; i++) {
            array[i] = aux;
            aux--;
        }
        return array;
    }

    public static void mostraVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] vector) {

        int mayor;

        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    mayor = vector[i];
                    vector[i] = vector[j];
                    vector[j] = mayor;
                }
            }
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

    public static void ordenaBombolla(int[] vector) {

        boolean swap;
        int mayor;
        int aux = vector.length;

        do {
            swap = false;
            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && vector[i] > vector[i + 1]) {
                    mayor = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = mayor;
                    swap = true;
                }
            }
            aux--;

            if (!swap) {
                for (int i = 0; i < vector.length; i++) {
                    System.out.print(vector[i] + " ");
                }
                System.out.println("");
            }

        } while (swap);
    }
}
