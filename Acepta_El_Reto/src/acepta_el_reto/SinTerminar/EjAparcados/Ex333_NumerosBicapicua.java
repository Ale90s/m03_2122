package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex333_NumerosBicapicua {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int aux, aux2;
        boolean capicua, ceros;

        while (n != 0) {
            
            if (n != numAlReves(n)) {
            capicua = false;
            ceros = false;
            aux = 0;
            aux2 = n;
            do {
                if (aux2 > 9) {
                    aux += aux2 % 10;
                    aux2 /= 10;
                    if (aux == 0) {
                        ceros = true;
                    }

                } else {
                    break;
                }
                if (ceros == true && aux != 0) {
                    break;
                } else if (aux == numAlReves(aux) && aux2 == numAlReves(aux2)) {
                    capicua = true;
                    break;
                }

                aux *= 10;

            } while (aux2 > 0);

            if (capicua) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            } else {
                System.out.println("NO");
            }
            n = in.nextInt();
        }
        in.close();
    }

    public static int numAlReves(int n) {

        int numAlReves = 0;
        while (n > 0) {
            numAlReves += n % 10;
            numAlReves *= 10;
            n /= 10;
        }
        return numAlReves / 10;
    }
}
