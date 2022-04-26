package uf2_ejercicios.a1;

public class Ex06_ComptadorMinesB {

    public static void main(String[] args) {

        int filas = 3, columnas = 3;
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if ((i == 0 && j == filas / 2) || (i == 1 && j == filas / 2)) {
                    matriz[i][j] = -1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        Ex05_Matrius.mostraMatriu(matriz);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Ex05_Matrius.mostraMatriu(comptaMines(matriz));
    }

    public static int[][] comptaMines(int[][] matriz) {

        int a = 0, b = 0, aux = b;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] == -1) {
                    a = i - 1;
                    b = j - 1;
                    for (int k = 0; k < 9; k++) {
                        if ((a >= 0) && (a <= matriz.length) && 
                                (b >= 0) &&(b <= matriz[0].length)) {
                            
                            if (matriz[a][b] > -1) {
                                matriz[a][b]++;
                            } // COMPRUEBA SI ESTÁ DENTRO DE LOS LÍMITES DEL ARRAY
                        }
                        b++;
                        if (b > aux + 1) {
                            b -= 3;
                            a++;
                        }
                    }
                }
            }
        }
        return matriz;
    }
}