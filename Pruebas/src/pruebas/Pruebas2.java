package pruebas;

import java.util.Scanner;

public class Pruebas2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while (n != 0) {
            long aMayor = 0, bMayor = 0, aNegativo = 0, bNegativo = 0, num = 0;

            boolean entroUnCero = false;

            for (int i = 0; i < n; i++) {

                num = in.nextLong();

                if (num == 0) {
                    entroUnCero = true;
                }

                if (num > 0 && num > bMayor) {
                    bMayor = aMayor;
                    aMayor = num;
                } else if (num < 0 && num < bNegativo) {
                    bNegativo = aNegativo;
                    aNegativo = num;
                }
            }

            long numeros[] = {aMayor, bMayor, aNegativo, bNegativo};
            long mayor = Long.MAX_VALUE + 1;
            if (entroUnCero) {
                mayor = 0;
            }
            long aux;

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    if (i != j) {
                        aux = numeros[i] * numeros[j];
                        if (aux != 0 && aux > mayor) {
                            mayor = numeros[i] * numeros[j];
                        }
                    }
                }
            }
            if (n == 1) {
                System.out.println(num);
            } else {
                System.out.println(mayor);
            }

            n = in.nextInt();
        }
    }
}
