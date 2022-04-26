package m03.uf1.a2;

import java.util.Scanner;

public class Ex11_DiaSetmana {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int dia;
        String error;
        System.out.print("Introdueix un nombre del 1 al 7:");
        dia = in.nextInt();
        error = in.next();
        switch (dia) {
            case 1:
                System.out.println("El de la setmana és: dilluns.");
                break;
            case 2:
                System.out.println("El de la setmana és: dimarts.");
                break;
            case 3:
                System.out.println("El de la setmana és: dimecres.");
                break;
            case 4:
                System.out.println("El de la setmana és: dijous.");
                break;
            case 5:
                System.out.println("El de la setmana és: divendres.");
                break;
            case 6:
                System.out.println("El de la setmana és: dissabte.");
                break;
            case 7:
                System.out.println("El de la setmana és: diumenge.");
                break;
            default:
                System.out.println("El dia de la setmana és: incorrecte");
        }
    }
}
