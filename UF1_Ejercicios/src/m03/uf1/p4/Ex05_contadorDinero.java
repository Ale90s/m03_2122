package m03.uf1.p4;

import java.util.Scanner;

public class Ex05_contadorDinero {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double bitllets[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        double monedes[] = {0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        double nBitllets = in.nextDouble();

        int nSinDecimal = (int) nBitllets;
        double nMonedes = nBitllets - nSinDecimal; // Separo la parte entera de la decimal
        
        int contador = 0; // Cuenta el numero de billetes/monedas de cada posicion
        
        for (int i = 0; i < bitllets.length; i++) {
            // BUCLE BILLETES Y MONEDAS DE 2€ Y 1€
            if (bitllets[i] <= 2) {
                System.out.printf("Monedes de %4.0f €: ", bitllets[i]);
            } else {
                System.out.printf("Bitllets de %3.0f €: ", bitllets[i]);
            }

            while (nBitllets >= bitllets[i]) {
                // RESTA AL NUMERO TOTAL Y SUMA AL CONTADOR
                nBitllets -= bitllets[i];
                contador++;
            }

            System.out.println(contador);
            contador = 0;
        }

        for (int i = 0; i < monedes.length; i++) {
            // BUCLE MONEDAS
            System.out.printf("Monedes de %.2f €: ", monedes[i]);

            while (nMonedes >= monedes[i]) {
                nMonedes -= monedes[i];
                contador++;
            }
            if (i == monedes.length - 2 && nMonedes > 0.0185) {
                // EN CASO DE QUE HAYA +0.0185 CENTIMOS POR FALLO DE REDONDEO QUE CUENTA 2CENTS
                contador++;
                nMonedes = 0;
            } else if (i == monedes.length - 1 && nMonedes > 0.0085) {
                // EN CASO DE QUE HAYA +0.0085 CENTIMOS POR FALLO DE REDONDEO QUE CUENTA 1 CENT
                contador++;
            }
            System.out.println(contador);
            contador = 0;
        }
    }
}
