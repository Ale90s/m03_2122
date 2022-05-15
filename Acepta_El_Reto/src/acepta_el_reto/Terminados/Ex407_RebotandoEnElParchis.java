package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex407_RebotandoEnElParchis {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int nCasillas, posicion, avance;

        do {
            nCasillas = in.nextInt();
            posicion = in.nextInt();
            avance = in.nextInt();
            if (nCasillas <= 0 && posicion <= 0 && avance <= 0) {
                break;
            }else {
                if (nCasillas < (posicion + avance)) {
                    int resto = (posicion + avance) - nCasillas;
                    System.out.printf("%d%n", nCasillas - resto);
                } else {
                    System.out.printf("%d%n", posicion + avance);
                }
            }
        } while (true);
        in.close();
    }
}
