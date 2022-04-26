package m03.uf1.a3;

import java.util.Scanner;

public class Ex09_EndevinaAmbPistes {

    private static final int MAX = 10;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = (int) (Math.random() * MAX + 1);
        int x;
        int contador = 1;
        /*El contador empieza en 1 para registrar el primer
                            intento.*/

        System.out.println("He pensar un nombre entre 1 i 10."
                + " Prova d'endevinar-ho!");
        System.out.print("Resposta: ");
        x = in.nextInt();
        while (x != n) {
            if (x < n) {
                System.out.println("Incorrecte, el nombre és major. "
                        + "Prova de nou");
                System.out.print("Resposta: ");
                x = in.nextInt();
                contador++;
            } else if (x > n) {
                System.out.println("Incorrecte, el nombre és menor. "
                        + "Prova de nou");
                System.out.print("Resposta: ");
                x = in.nextInt();
                contador++;
            }
        }
        System.out.println("Correcte!!!");
        System.out.printf("Has necessitat %d intents per endevinar "
                + "el nombre.%n", contador);
    }
}
