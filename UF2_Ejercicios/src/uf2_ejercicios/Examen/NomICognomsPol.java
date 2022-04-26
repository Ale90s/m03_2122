package uf2_ejercicios.Examen;

import java.util.Scanner;

public class NomICognomsPol {

    public static void main(String[] args) {
        String[] nomsComplets = {
            "Torres Hernández, Pere",
            "Majoral Gatell, Anna",
            "Pérez Gomis, Josep",
            "López López, Rosa",
            "Camps García, Ricard",
            "Sánchez Pasqual, Carles",
            "Mengual Sánchez, Gemma",
            "Puig Soler, Jordi"
        };
        ordenaBombolla(nomsComplets);
        System.out.println("Introdueix nom de pila a buscar:");
        Scanner in = new Scanner(System.in);
        String nom = in.nextLine();
        int posicio = cercaBinaria(nomsComplets, nom);
        if (posicio >= 0) {
            System.out.println("El nom " + nom + " s'ha trobat a la posició " + (posicio + 1) + " de la llista ordenada.");
        } else {
            System.out.println("El nom " + nom + " no s'ha trobat a la llista.");
        }
    }

    public static int cercaBinaria(String[] nomsComplets, String nom) {
        int indexEsquerra = 0;
        int indexDreta = nomsComplets.length - 1;
        int index;
        String aux;
        // boolean trobat = false;
        while (indexEsquerra <= indexDreta /* && !trobat */) {
            index = (indexEsquerra + indexDreta) / 2;
            aux = nomsComplets[index].split(",")[1].trim();

            if (aux.equals(nom)) {
                // trobat = true;
                return index;
            } else if (nom.compareToIgnoreCase(aux) > 0) {
                indexEsquerra = index + 1;
            } else {
                indexDreta = index - 1;
            }
        }
        return -1;
    }

    public static void ordenaBombolla(String[] nomsComplets) {
        String aux, aux2, aux3;
        for (int i = 0; i < nomsComplets.length; i++) {
            for (int j = 0; j < nomsComplets.length - 1 - i; j++) {
                aux = nomsComplets[j].split(",")[1].trim();
                aux2 = nomsComplets[j + 1].split(",")[1].trim();
                if (aux.compareToIgnoreCase(aux2) > 0) {
                    aux3 = nomsComplets[j];
                    nomsComplets[j] = nomsComplets[j + 1];
                    nomsComplets[j + 1] = aux3;
                }
            }
        }
        mostraNoms(nomsComplets);
    }

    public static void mostraNoms(String[] nomsComplets) {
        System.out.println("Llista de noms:");
        for (int i = 0; i < nomsComplets.length; i++) {
            System.out.println((i + 1) + ". " + nomsComplets[i]);
        }
    }
}
