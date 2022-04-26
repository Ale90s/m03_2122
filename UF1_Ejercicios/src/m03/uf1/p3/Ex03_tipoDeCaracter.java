package m03.uf1.p3;

import java.util.Scanner;

public class Ex03_tipoDeCaracter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();
        char caracterFrase;
        int mayuscula = 0, minuscula = 0, otras = 0;

        for (int i = 0; i < frase.length(); i++) {
            caracterFrase = frase.charAt(i);
            if (Character.isUpperCase(caracterFrase)) {
                mayuscula++;
            } else if (Character.isLowerCase(caracterFrase)) {
                minuscula++;
            } else {
                otras++;
                }
            }
        System.out.printf("La frase conté %d majúscules%n", mayuscula);
        System.out.printf("La frase conté %d minúscules%n", minuscula);
        System.out.printf("La frase conté %d altres caràcters%n", otras);
    }
}