package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex458_EnLaMenteDelTimonel {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while (n != 0) {
            int aMayor = 0, bMayor = 0, aNegativo = 0, bNegativo = 0, num;
            boolean entroUnCero = false;

            for (int i = 0; i < n; i++) {

                num = in.nextInt();

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

            int numeros[] = {aMayor, bMayor, aNegativo, bNegativo};
            int mayor;
            if (entroUnCero) {
                mayor = 0;
            } else {
                mayor = -2147483648;
            }

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    if (i != j) {
                        if (numeros[i] * numeros[j] > mayor && numeros[i] * numeros[j] != 0) {
                            mayor = numeros[i] * numeros[j];
                        }
                    }
                }
            }
            System.out.println(mayor);

            n = in.nextInt();
        }
    }
}
