package m03.uf1.p2;

import java.util.Locale;
import java.util.Scanner;

public class Ex10_mediaAritmetica {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("eng", "us"));
        Scanner in = new Scanner(System.in);
        double notas, contador = 0, repeticion = 0, aprobado = 0, suspendido = 0;
        
        do {

            notas = in.nextInt();

            if (notas >= 0 && notas <= 10) {
                contador += notas;
                repeticion++;
            }

            if (notas >= 5 && notas <= 10) {
                aprobado++;
            } else if (notas <= 4 && notas >= 0) {
                suspendido++;
            }

        } while (notas >= 0 && notas <= 10);
        
        System.out.printf("Mitjana: %.2f%n", contador / repeticion);
        System.out.printf("Percentatge d'aprovats: %.2f%%%n",
                (aprobado * 100) / (aprobado + suspendido));
        System.out.printf("Percentatge de suspesos: %.2f%%%n",
                (suspendido * 100) / (aprobado + suspendido));
        
    }
}
