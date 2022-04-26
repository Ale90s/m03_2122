package m03.uf1.a2;

import java.util.Scanner;

public class Ex07_TresNombresMenor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Digueu un nombre:");
        n1 = in.nextInt();
        System.out.print("Digueu un altre:");
        n2 = in.nextInt();
        System.out.print("Digueu un altre:");
        n3 = in.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.printf("%d%n", n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.printf("%d%n", n2);
        } else if (n3 < n1 && n3 < n2) {
            System.out.printf("%d%n", n3);
        } else {
            System.out.println("Varios números son iguales, vuelve a"
                    + " intentarlo...");
        }
    }
}