package m03.uf1.p3;

import java.util.Scanner;

public class Ex01_cuentaVocales {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "iso-8859-1");
        String frase = in.nextLine();
        char charFrase = 0;
        int vocal = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            
            switch (frase.charAt(i)) {
                case 'a':
                case 'á':
                case 'à':
                case 'ä':
                case 'e':
                case 'é':
                case 'è':
                case 'ë':
                case 'i':
                case 'í':
                case 'ì':
                case 'ï':
                case 'o':
                case 'ó':
                case 'ò':
                case 'ö':
                case 'u':
                case 'ú':
                case 'ù':
                case 'ü':
                    vocal++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("La frase conté %d vocals.%n", vocal);
    }
}
