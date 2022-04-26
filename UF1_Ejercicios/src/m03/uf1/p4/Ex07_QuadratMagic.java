package m03.uf1.p4;

import java.util.Scanner;

public class Ex07_QuadratMagic {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0, fila, columna, contador = 1;
        int[][] matriz;
        boolean matrizLlena = false;
        
        /*
         * n - Delimita lo grande que va a ser el cuadrado (debe ser un númeo 
         * impar y estar en un rango de entre 3 y 21)
         * 
         * fila - Filas del cuadrado (n filas) [cuando fila = -1 se sale del cuadrado
         * por lo que tenemos que corregirlo]
         *
         * columna - Columnas del cuadrado (n columnas) [cuando columnas = n 
         * se sale del cuadrado por lo que tenemos que corregirlo]
         *
         * contador - Es el contador que va dando valores a las posiciones
         *
         * matriz - Es la matriz donde guardaremos los valores
         *
         * matrizLlena - Booleano que hace que salga del dowhile cuando el cuadrado
         * finalice (finaliza cuando el contador es el cuadrado del numero)
        */

        // ENTRADA NUMERO
        do {

            if (in.hasNextInt()) {
                n = in.nextInt();
            } else {
                in.nextLine();
            }

        } while (n % 2 == 0 || (n < 3 || n > 21));

        // DAMOS VALORES A LA MATRIZ Y ESCRIBIMOS LA PRIMERA POSICION
        matriz = new int[n][n];
        fila = 0;
        columna = n / 2;
        matriz[fila][columna] = contador;
        fila--;
        columna++;
        contador++;

        // BUCLE DE ESCRITURA
        do {

            if (fila == -1 && columna == n) {
                // EN EL CASO DE QUE ESTE EN LA ESQUINA DE ARRIBA A LA DERECHA
                // HACEMOS QUE ESCRIBA ABAJO PORQUE LA OTRA ESQUINA YA ESTA ESCRITA
                fila += 2;
                columna -= 1;
                matriz[fila][columna] = contador;

                fila--;
                columna++;

            } else if (columna == n) {
                // EN EL CASO DE QUE LA COLUMNA SE SALGA POR LA DERECHA
                columna = 0;
                matriz[fila][columna] = contador;

                fila--;
                columna++;

            } else if (fila == -1) {
                // EN EL CASO DE QUE LA FILA SE SALGA POR ARRIBA
                fila = n - 1;
                matriz[fila][columna] = contador;

                fila--;
                columna++;

            } else {
                // CASOS NORMALES EN LOS QUE NO HAY QUE MODIFICAR NI FILA NI COLUMNA
                if (matriz[fila][columna] != 0) {
                    // EN CASO DE QUE LA POSICION YA TENGA VALOR ESCRIBIMOS LA POSICION
                    // DE ABAJO DEL NUMERO ANTERIOR
                    fila += 2;
                    columna--;
                    matriz[fila][columna] = contador;
                } else {
                    // EN CASO DE QUE LA POSICION NO TENGA VALOR
                    matriz[fila][columna] = contador;
                }

                fila--;
                columna++;

            }
            if (contador == Math.pow(n, 2)) {
                // CUANDO EL CONTADOR SEA EL NUMERO AL CUADRADO QUE SALGA DEL BUCLE
                matrizLlena = true;
            }
            contador++;
        } while (!matrizLlena);

        // BUCLE DE LECTURA
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n == 3) {
                    // JUSTIFICA UNIDADES
                    System.out.printf("%d ", matriz[i][j]);
                } else if (n < 11) {
                    // JUSTIFICA DECENAS
                    System.out.printf("%2d ", matriz[i][j]);
                } else {
                    // JUSTIFICA CENTENAS
                    System.out.printf("%3d ", matriz[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
