package m03.uf1.a1;

import java.util.Scanner;

public class Ex15_Segons {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long segons, dies;
        int minuts, hores, restoSegons;

        System.out.print("Introdueixi nombre gran de segons:");
        segons = in.nextLong();
        dies = segons / 86400;
        hores = (int) ((segons % 86400) / 3600);
        minuts = (int) (((segons % 86400) % 3600) / 60);
        restoSegons = (int) (((segons % 86400) % 3600) % 60);

        System.out.printf("%,d segons equival a %,d dies, %,d hores, %,d minuts"
                + " i %,d segons. %n", segons, dies, hores, minuts,
                restoSegons);
    }
}