package m03.uf1.a2;

import java.util.Scanner;

public class Ex10_AnyDeTraspas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int any;

        System.out.print("Introdueix un any:");
        any = in.nextInt();

        if (any % 100 == 0) {
            System.out.println("L'any " + any + " NO és de traspàs.");
        } else if (any % 4 == 0) {
            System.out.println("L'any " + any + " és de traspàs.");
        } else {
            System.out.println("L'any " + any + "NO és de traspàs.");
        }
    }
}
