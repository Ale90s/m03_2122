package m03.uf1.a5;

import java.util.Scanner;

public class Ex09_VectorPrimersPrimers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int primes[] = new int[100];
        int n = 3;
        int contImpr = 0;
        boolean isPrime;

        /*
        nPrimos[] - ES EL ARRAY QUE GUARDA LOS NÚMEROS PRIMOS.
        
        n - SON LOS NUMEROS QUE SE VAN A CHEQUEAR SI SON NÚMEROS PRIMOS.
        
        contImpr - ES EL ENCARGADO DE HACER LOS PRINTLN PARA QUE SALGA
                             BIEN LA SALIDA POR CONSOLA
        
        primoEncontrado - EN CASO DE QUE SE ENCUENTRE UN PRIMO, PARA QUE SALGA DEL
                          BUCLE WHILE, Y SIGA AL SIGUIENTE HUECO DEL ARRAY (i++)
         */
        for (int i = 0; i < primes.length; i++) {

            if (i == 0) {
                primes[0] = 2;
                System.out.printf("  %d,  ", primes[i]);
                contImpr++;
                // PRIMERA VUELTA, SE INTRODUCE 2 "MANUALMENTE"
            } else {

                do {

                    isPrime = false;

                    for (int j = 0; j < i; j++) {

                        if (n % primes[j] == 0) {

                            n++;
                            isPrime = false;
                            break;
                            //EL NUMERO NO ES PRIMO

                        } else if (n % primes[j] != 0 && j + 1 == i) {

                            primes[i] = n;
                            n++;
                            isPrime = true;
                            //EL NUMERO ES PRIMO
                            contImpr++;
                            if (i == 99) {
                                System.out.printf("%3d.%n", primes[i]);
                            } else if (contImpr == 10) {
                                System.out.printf("%3d,   %n", primes[i]);
                                contImpr = 0;
                            } else {
                                System.out.printf("%3d,  ", primes[i]);
                            }
                        }
                    }
                } while (!isPrime);
            }
        }
        System.out.print("Prem la tecla ENTER per acabar...");
        in.nextLine();
    }
}
