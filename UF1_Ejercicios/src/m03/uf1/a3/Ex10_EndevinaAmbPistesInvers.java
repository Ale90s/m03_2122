package m03.uf1.a3;

import java.util.Scanner;

public class Ex10_EndevinaAmbPistesInvers {

    private static final int MAX = 10;
    private static final int MIN = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String eleccion;
        String a = "a", b = "b", c = "c";
        int n = (int) (Math.random() * (MAX - MIN - 1) + MIN + 1);
        int nuevaMaxima = MAX, nuevaMinima = MIN;

        System.out.println("Pensa un nombre entre 1 i 10. Provaré d'endevinar-ho!");

        System.out.printf("És el %d? Massa (a)lt, massa (b)aix o (c)orrecte?", n);

        eleccion = in.nextLine();

        do {
            switch (eleccion) {
                case "a":
                    nuevaMaxima = n;
                    n = (int) (Math.random() * (nuevaMaxima - MIN - 1)
                            + MIN + 1);
                    System.out.printf("És el %d? Massa (a)lt, massa (b)aix o "
                            + "(c)orrecte?", n);
                    eleccion = in.nextLine();
                    break;
                case "b":
                    nuevaMinima = n;
                    n = (int) (Math.random() * (MAX - nuevaMinima - 1)
                        + nuevaMinima + 1);
                    System.out.printf("És el %d? Massa (a)lt, massa (b)aix o "
                        + "(c)orrecte?", n);
                    eleccion = in.nextLine();
                break;
                case "c":
                System.out.printf("Genial!!! Soc el millor endevinador del "
                        + "mon!!!%n");
                break;
                default: 
                    System.out.println("Debes introducir 'a', 'b' o 'c'...");
                    eleccion = in.nextLine();
                    break;
            }
        }while (!eleccion.equals("c"));
    }
}
