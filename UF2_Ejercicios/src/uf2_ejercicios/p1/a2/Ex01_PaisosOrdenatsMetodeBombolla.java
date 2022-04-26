package uf2_ejercicios.p1.a2;

import java.util.Scanner;

public class Ex01_PaisosOrdenatsMetodeBombolla {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nPaises = in.nextInt();
        in.nextLine();
        String[] paises = new String[nPaises];

        for (int i = 0; i < paises.length; i++) {
            paises[i] = in.nextLine();
        }

        paises = ordenaBombolla(paises);

        System.out.println("Països ordenats:");

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }

    }

    public static String[] ordenaBombolla(String[] array) {

        boolean swap;
        String mayor;
        int aux = array.length;

        do {
            swap = false;
            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && array[i].compareTo(array[i + 1]) > 0) {
                    mayor = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = mayor;
                    swap = true;
                    aux--;
                }
            }
        } while (swap);
        return array;
    }
}
