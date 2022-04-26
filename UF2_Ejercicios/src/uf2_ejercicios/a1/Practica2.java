package uf2_ejercicios.a1;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] personas = {"Torres Hernández, Pere", "Majoral Gatell, Anna",
            "Pérez Gomis, Josep", "López López, Rosa", "Camps García, Ricard",
            "Sánchez Pasqual, Carles", "Mangual Sánchez, Genma", "Puig Soler, Jordi"};
        String nomTest;

        personas = ordenaBombolla(personas);
        mostraNoms(personas);
        System.out.println("");

        do {

            System.out.print("Introdueix un nom (Intro para acabar): ");
            nomTest = in.nextLine();
            if (nomTest.equals("")) {
                break;
            } else {
                
            }
        } while (true);
    }

    public static String[] ordenaBombolla(String[] array) {
        boolean finish;
        String nombres[] = new String[array.length];
        String mayor, mayorNombres;
        int aux = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length() - 1; j > 0; j--) {
                if (array[i].charAt(j) == ',') {
                    nombres[i] = array[i].substring(j + 2, array[i].length());
                }
            }
        }

        do {
            finish = true;
            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && nombres[i].compareTo(nombres[i + 1]) > 0) {
                    mayor = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = mayor;

                    mayorNombres = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = mayorNombres;

                    finish = false;
                }
            }
            aux--;
        } while (!finish);
        return array;
    }

    public static void mostraNoms(String[] array) {
        System.out.println("Llista de noms:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d. %s%n", i + 1, array[i]);
        }
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

    public static int cercaBinaria(String[] nomsComplets, String nom) {

        return 0;
    }
}
