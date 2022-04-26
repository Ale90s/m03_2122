package m03.uf1.a4;

import java.util.Scanner;

public class Ex09_LletraDNI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroDni;
        char letraDni = 0;
        System.out.print("Introdueix la part numérica del DNI: ");
        numeroDni = in.nextInt();

        switch (numeroDni % 23) {
            case 0:
                letraDni = 'T';
                break;
            case 1:
                letraDni = 'R';
                break;
            case 2:
                letraDni = 'W';
                break;
            case 3:
                letraDni = 'A';
                break;
            case 4:
                letraDni = 'G';
                break;
            case 5:
                letraDni = 'M';
                break;
            case 6:
                letraDni = 'Y';
                break;
            case 7:
                letraDni = 'F';
                break;
            case 8:
                letraDni = 'P';
                break;
            case 9:
                letraDni = 'D';
                break;
            case 10:
                letraDni = 'X';
                break;
            case 11:
                letraDni = 'B';
                break;
            case 12:
                letraDni = 'N';
                break;
            case 13:
                letraDni = 'J';
                break;
            case 14:
                letraDni = 'Z';
                break;
            case 15:
                letraDni = 'S';
                break;
            case 16:
                letraDni = 'Q';
                break;
            case 17:
                letraDni = 'V';
                break;
            case 18:
                letraDni = 'H';
                break;
            case 19:
                letraDni = 'L';
                break;
            case 20:
                letraDni = 'C';
                break;
            case 21:
                letraDni = 'K';
                break;
            case 22:
                letraDni = 'E';
                break;
        }
        System.out.printf("El DNI AMB LLETRA ÉS: %d-%c%n", numeroDni,letraDni);
    }
}
