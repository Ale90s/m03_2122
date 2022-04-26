package uf2_ejercicios.a1;

public class Ex08_GeneraPrimers {

    public static void main(String[] args) {
        
        int nPrimos = 100;
        int[] numerosPrimos = new int[nPrimos];
        int buscaPrimo = 2, contador = 0;
        boolean primeFound = false;

        numerosPrimos[0] = 1;
        
        for (int i = 1; i < nPrimos; i++) {

            do {
                for (int j = 1; j < buscaPrimo / 2; j++) {
                    
                    if (buscaPrimo % j == 0) {
                        contador++;
                    }
                    
                }

                if (contador == 1) {
                    numerosPrimos[i] = buscaPrimo;
                    primeFound = true;
                }
                buscaPrimo++;
                contador = 0;

            } while (!primeFound);
            primeFound = false;
        }
        for (int i = 0; i < nPrimos; i++) {
            System.out.print(numerosPrimos[i] + " ");
        }
        
        System.out.println("");
        System.out.println(esNombrePrimer(113, nPrimos, numerosPrimos));
        System.out.println(esNombrePrimer(114, nPrimos, numerosPrimos));
        
    }

    public static boolean esNombrePrimer(int n, int nPrimo, int[] primos) {

        for (int i = 0; i < nPrimo; i++) {
            if (n == primos[i]) {
                return true;
            }
        }
        return false;
    }
}
