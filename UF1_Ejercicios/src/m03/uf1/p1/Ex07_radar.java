package m03.uf1.p1;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_radar {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "us"));
        Scanner in = new Scanner(System.in);
        int vmax, vmedia;
        double distancia, tiempo;


        /* distancia = metros, vmax = km/h, tiempo (que tarda en recorrer el
        tramo) = segundo, vmedia = regla de tres */
        distancia = in.nextInt();
        vmax = in.nextInt();
        tiempo = in.nextInt();

        vmedia = (int) ((distancia / 1000) / (tiempo / 3600));

        if (vmedia > (vmax + (vmax * 0.2))) {
            System.out.println("Velocitat mitja: " + vmedia
                    + " km/h => MULTA I PUNTS.");
        } else if (vmedia > vmax) {
            System.out.println("Velocitat mitja: " + vmedia
                    + " km/h => MULTA.");
        } else {
            System.out.println("Velocitat mitja: " + vmedia
                    + " km/h => Dintre dels límits.");
        }
    }
}
