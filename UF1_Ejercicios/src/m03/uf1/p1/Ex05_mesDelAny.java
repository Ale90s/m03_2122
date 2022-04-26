package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex05_mesDelAny {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "us"));
        Scanner in = new Scanner(System.in);

        int mes = in.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Número de dies: 31.");
                break;
            case 2:
                System.out.println("Número de dies: 28.");
                break;
            case 3:
                System.out.println("Número de dies: 31.");
                break;
            case 4:
                System.out.println("Número de dies: 30.");
                break;
            case 5:
                System.out.println("Número de dies: 31.");
                break;
            case 6:
                System.out.println("Número de dies: 30.");
                break;
            case 7:
                System.out.println("Número de dies: 31.");
                break;
            case 8:
                System.out.println("Número de dies: 31.");
                break;
            case 9:
                System.out.println("Número de dies: 30.");
                break;
            case 10:
                System.out.println("Número de dies: 31.");
                break;
            case 11:
                System.out.println("Número de dies: 30.");
                break;
            case 12:
                System.out.println("Número de dies: 31.");
                break;
            default:
                System.out.println("Mes incorrecte.");
        }
    }
}
