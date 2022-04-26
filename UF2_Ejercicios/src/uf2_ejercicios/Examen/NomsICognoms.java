package uf2_ejercicios.Examen;

import java.util.Scanner;

public class NomsICognoms {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] nomComplets = {"Torres Hernández, Pere", "Majoral Gatell, Anna",
            "Pérez Gomis, Josep", "López López, Rosa", "Camps García, Ricard",
            "Sánchez Pasqual, Carles", "Mengual Sánchez, Gemma", "Puig Soler, Jordi"};
        nomComplets = ordenaBombolla(nomComplets);
        mostraNoms(nomComplets);

        System.out.print("Introdueix un nom: ");
        String nomAEncontrar = in.nextLine();

        int posicion = cercaBinaria(nomComplets, nomAEncontrar);

        if (posicion == -1) {
            System.out.printf("El nom %s no s'ha trobat a la llista.%n", nomAEncontrar);
        } else {
            System.out.printf("El nom %s s'ha trobat a la posició %d de la llista ordenada.%n",
                    nomAEncontrar, posicion + 1);
        }

    }

    public static String[] ordenaBombolla(String[] nomComplets) {

        String[] comparaA, comparaB;
        boolean acaba;
        String mayor;
        int aux = nomComplets.length;

        do {
            acaba = true;

            for (int i = 0; i < aux; i++) {

                if ((i < aux - 1)) {

                    comparaA = nomComplets[i].split(", ");
                    comparaB = nomComplets[i + 1].split(", ");
                    // CON DOS ARRAYS AUXILIARES ROMPO EL STRING POR LA COMA
                    // PARA SACAR EL NOMBRE

                    if ((comparaA[1].compareTo(comparaB[1]) > 0)) {
                        // SI Pere ES MAYOR QUE Anna QUE SE INTERCAMBIEN POSICIONES (EJEMPLO)
                        mayor = nomComplets[i];
                        nomComplets[i] = nomComplets[i + 1];
                        nomComplets[i + 1] = mayor;
                        acaba = false;
                    }
                }
            }
            aux--; // VA RESTANDO MENOS UNO PORQUE SE ENTIENDE QUE EN CADA VUELTA
            // EL ÚLTIMO ESPACIO VA A QUEDAR CUBIERTO SEGURO

        } while (!acaba);

        return nomComplets;
    }

    public static void mostraNoms(String[] nomComplets) {

        System.out.println("");

        System.out.println("Llista de noms:");
        for (int i = 0; i < nomComplets.length; i++) {
            System.out.printf("%d. %s%n", i + 1, nomComplets[i]);
        }

        System.out.println("");
    }

    public static int cercaBinaria(String[] nomComplets, String nom) {

        int indexInicio = 0, indexFinal = nomComplets.length - 1,
                indexMedio = (indexFinal + indexInicio) / 2;
        String nombre[];

        while (true) {

            nombre = nomComplets[indexMedio].split(", ");
            // METO EN EL ARRAY nombre LA COMPROBACION DEL INDICE DEL MEDIO
            
            if (nombre[1].compareTo(nom) < 0) {
                indexInicio = indexMedio;
            } else if (nombre[1].equals(nom)) {
                return indexMedio;
            } else {
                indexFinal = indexMedio;
            }

            if (indexInicio == indexMedio && indexFinal == indexMedio + 1) {

                if (nombre[1].equals(nom)) {
                    return indexMedio;
                } else {

                    nombre = nomComplets[indexFinal].split(", ");

                    if (nombre[1].equals(nom)) {
                        return indexFinal;
                    } else {
                        return -1;
                    }
                }
            }
            indexMedio = (indexFinal + indexInicio) / 2;
        }
    }
}
