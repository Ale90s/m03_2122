package uf2_ejercicios.a1;

public class pruebas2 {

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

        int filas = matriz.length, columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (matriz[i][j] != -1) {

                    if (i == 0 && j == 0) {

                        if (matriz[i][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }

                    } else if (i == filas - 1 && j == 0) {

                        if (matriz[i - 1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i - 1][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }

                    } else if (j == 0) {

                        if (matriz[i - 1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i - 1][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }

                    } else if (i == 0 && j == columnas - 1) {

                        if (matriz[i][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        
                    } else if (i == filas - 1 && j == columnas - 1) {
                        
                        if (matriz[i-1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        
                    } else if (j == columnas - 1) {
                        
                        if (matriz[i-1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        
                    } else if (i == 0 && j == filas / 2) {

                        if (matriz[i][j - 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j - 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i + 1][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j + 1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }

                    } else if (i == filas - 1 && j == filas / 2) {
                        
                        if (matriz[i][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j+1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j+1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        
                    } else {
                        
                        if (matriz[i][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i-1][j+1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i][j+1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j-1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        if (matriz[i+1][j+1] == -1) {
                            matriz[i][j] = matriz[i][j] + 1;
                        }
                        
                    }
                }
            }
        }

        return matriz;
    }
}

