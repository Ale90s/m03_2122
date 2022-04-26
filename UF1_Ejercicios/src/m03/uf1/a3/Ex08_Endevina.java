package m03.uf1.a3;

import java.util.Scanner;

public class Ex08_Endevina {

    private static final int MAX = 10;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = (int) (Math.random() * MAX + 1);
        int resposta, contador = 0;

        System.out.println("He pensat un nombre entre 1 i 10. Prova "
                + "d'endevinar-ho!");
        System.out.printf("Resposta: ");
        resposta = in.nextInt();
        
        while (resposta != n) {
            System.out.println("Incorrecte. Prova de nou");
            System.out.printf("Resposta: ");
            resposta = in.nextInt();
            contador++;
        }
        System.out.println("Correcte!!!");
        System.out.printf("Has necessitat %d intents per endevinar el "
                + "nombre. %n", contador);
    }
}
