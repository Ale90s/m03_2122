package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex06_temp {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "us"));
        Scanner in = new Scanner(System.in);

        int inhoras, inminutos, insegundos, totalsegundos,
                horas, minutos, segundos;

        inhoras = in.nextInt();
        inminutos = in.nextInt();
        insegundos = in.nextInt();

        totalsegundos = (inhoras * 3600) + (inminutos * 60) + insegundos;

        horas = totalsegundos / 3600;
        minutos = (totalsegundos - (horas * 3600)) / 60;
        segundos = (totalsegundos - (minutos * 60)) % 60;

        segundos++; // "Un segundo después..."

        if (segundos > 59) {
            minutos = minutos + 1;
            segundos = 0;
        }
        if (minutos > 59) {
            minutos = 0;
            horas = horas + 1;
        }
        if (horas >= 24) {
            horas = 0;
        }

        System.out.printf("Un segon després són les %02d:%02d:%02d%n",
                horas, minutos, segundos);
    }
}
