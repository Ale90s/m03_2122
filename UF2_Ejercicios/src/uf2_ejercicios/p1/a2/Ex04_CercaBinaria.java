package uf2_ejercicios.p1.a2;

import java.util.Scanner;

public class Ex04_CercaBinaria {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nPaises = in.nextInt();
        String[] paises = new String[nPaises];

        in.nextLine();

        for (int i = 0; i < paises.length; i++) {
            paises[i] = in.nextLine();
        }

        String paisABuscar = in.nextLine();

        int busqueda = busquedaBinaria(paises, paisABuscar);

        if (busqueda == -1) {
            System.out.println("No trobat");
        } else {
            System.out.println("Trobat a la posició: " + busqueda);
        }
    }

    public static int busquedaBinaria(String[] array, String valor) {

        int indexInicio = 0, indexFinal = array.length - 1,
                indexMedio = (indexFinal + indexInicio) / 2, contador = 0;

        while (true) {
            contador++;
            if (array[indexMedio].compareTo(valor) < 0) {
                indexInicio = indexMedio;
            } else if (array[indexMedio].equals(valor)) {
                System.out.println("Total passades: " + contador);
                return indexMedio;
            } else {
                indexFinal = indexMedio;
            }
            indexMedio = (indexFinal + indexInicio) / 2;

            if (indexInicio == indexMedio && indexFinal == indexMedio + 1) {
                System.out.println("Total passades: " + contador);
                if (valor.equals(array[indexMedio])) {
                    return indexMedio;
                } else if (valor.equals(array[indexFinal])) {
                    return indexFinal;
                } else {
                    return -1;
                }
            }
        }
    }
}
