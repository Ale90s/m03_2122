package m03.uf1.p4;

import java.util.Scanner;

public class Ex06_Tabla2D {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int files = 4, columnes = in.nextInt(), contador = 0;
        int[][] tabla = new int[files][columnes];

        /*
         * files  - define la longitud de vertical del Array bidimensional, se setea a longitud 4 (0, 1, 2, 3)
         *
         * columnes - define la longitud horizontal
         *
         * contador - se usa para alternar el mismo bucle for para varias utilidades y de esa manera quede un código más
         * limpio sin necesidad de tener muchos bucles
         *
         * [][]tabla - Es el Array bidimensional y es el encargado de almacenar todos los datos operacionales
         */


        for (int i = 0; i < columnes; i++) {
            // BUCLE DE ESCRITURA DEL ARRAY
            if (contador == 0) {
                // REALIZA LAS DOS PRIMERAS FILAS DE OPERACIONES
                if (i == 0) {
                    // SI ES LA PRIMERA VUELTA DE LAS DOS PRIMERAS FILAS QUE DE UN VALOR BASE
                    tabla[0][i] = 2;
                    tabla[1][i] = (int) Math.pow(1, 2);

                } else {

                    tabla[0][i] = (2 + (i * 2));
                    tabla[1][i] = (int) Math.pow(i + 1, 2);
                }
            } else {
                // REALIZA LAS DOS SEGUNDAS FILAS DE OPERACIONES
                tabla[2][i] = tabla[0][i] - tabla[1][i];
                tabla[3][i] = tabla[0][i] + tabla[1][i] + tabla[2][i];
            }

            if (i == columnes - 1 && contador == 0) {
                contador = 1;
                i = -1;
            }
        }

        for (int i = 0; i < columnes; i++) {
            // BUCLE DE LECTURA DEL ARRAY
            // EL SWITCH CON AYUDA DEL CONDICIONAL DE ABAJO SE ENCARGA DE ALTERNAR ENTRE LAS DIFERENTES FILAS DEL ARRAY PARA
            // NO TENER QUE HACER USO DE CUATRO BUCLES PARA CADA FILA DEL ARRAY
            switch (contador) {
                case 1:
                    System.out.printf("%d\t", tabla[0][i]);
                    break;
                case 2:
                    System.out.printf("%d\t", tabla[1][i]);
                    break;
                case 3:
                    System.out.printf("%d\t", tabla[2][i]);
                    break;
                case 4:
                    System.out.printf("%d\t", tabla[3][i]);
                    break;
                default:
                    break;
            }
            if (i == columnes - 1 && contador < 4) {
                System.out.println("");
                contador++;
                i = -1;
            }
        }
    }
}