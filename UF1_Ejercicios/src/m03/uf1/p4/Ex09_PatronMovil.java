package m03.uf1.p4;

import java.util.Scanner;

public class Ex09_PatronMovil {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int filas = in.nextInt(), columnas = in.nextInt(),
                f = in.nextInt(), c = in.nextInt();
        f--;
        c--;
        filas = filas + filas - 1;
        columnas = columnas + columnas - 1;
        int patron[][] = new int [filas][columnas];
        
        patron[f][c]++;
        
        String nPatron = in.next();
        String[] n = nPatron.split("");
        
        /*
         * filas - columnas - DEFINE EL TAMAÑO DE LA MATRIZ
         *
         * f - c - POSICION DE LA FILA Y LA COLUMNA PARA SEGUIR EL TRAZO
         *
         * patron - ARRAY DE INT PARA DETECTAR POR DONDE PASA
         * 
         * DIAGONAL / = 1000
         * 
         * DIAGONAL \ = 2000
         *
         * DOS DIAGONALES X = 3000
        */
        
        // ESCRIBIR ARRAY
        for (int i = 0; i < n.length; i++) {

            switch (n[i]) {
                // ARRIBA IZQ
                case "1":
                    f--;
                    c--;
                    // EN LAS DIAGONALES SI VALE 0 DIBUJA LA LINEA (1000) Y SI YA
                    // SE DIBUJO LA LINEA CONTRARIA DIAGONAL (2000) SE DIBUJA UNA X
                    if(patron[f][c] == 0) {
                        patron[f][c] = 1000;
                    } else if (patron[f][c] == 2000) {
                        patron[f][c] = 3000;
                    }
                    f--;
                    c--;
                    patron[f][c]++;
                    break;
                // ARRIBA
                case "2":
                    f--;
                    patron[f][c]++;
                    f--;
                    patron[f][c]++;
                    break;
                // ARRIBA DER
                case "3":
                    f--;
                    c++;
                    if(patron[f][c] == 0) {
                        patron[f][c] = 2000;
                    } else if (patron[f][c] == 1000) {
                        patron[f][c] = 3000;
                    }
                    f--;
                    c++;
                    patron[f][c]++;
                    break;
                // IZQ
                case "4":
                    c--;
                    patron[f][c]++;
                    c--;
                    patron[f][c]++;
                    break;
                // LEVANTA DEDO
                case "5":
                    i = n.length;
                    break;
                // DER
                case "6":
                    c++;
                    patron[f][c]++;
                    c++;
                    patron[f][c]++;
                    break;
                // ABAJO IZQ
                case "7":
                    f++;
                    c--;
                    if(patron[f][c] == 0) {
                        patron[f][c] = 2000;
                    } else if (patron[f][c] == 1000) {
                        patron[f][c] = 3000;
                    }
                    f++;
                    c--;
                    patron[f][c]++;
                    break;
                // ABAJO
                case "8":
                    f++;
                    patron[f][c]++;
                    f++;
                    patron[f][c]++;
                    break;
                // ABAJO DER
                case "9":
                    f++;
                    c++;
                    if(patron[f][c] == 0) {
                        patron[f][c] = 1000;
                    } else if (patron[f][c] == 2000) {
                        patron[f][c] = 3000;
                    }
                    f++;
                    c++;
                    patron[f][c]++;
                    break;
                default:
                    break;
            }
        }
        // MARCO SUPERIOR
        System.out.print("+");
        for (int i = 0; i < columnas; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        // PRINTAR ARRAY
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                
                if (i % 2 == 0 && j % 2 == 0) {
                    // POSICION DEL DEDO
                    switch (patron[i][j]) {
                        case 0:
                            System.out.print(".");
                            break;
                        default:
                            System.out.print("O");
                            break;
                    }
                } else if (i % 2 == 0) {
                    // SI DESLIZA HORIZONTALMENTE
                    switch (patron[i][j]) {
                        case 0:
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("-");
                            break;
                    }
                } else if (j % 2 == 0) {
                    // SI DESLIZA VERTICALMENTE
                    switch (patron[i][j]) {
                        case 0:
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("|");
                            break;
                    }
                } else {
                    // SI DESLIZA DIAGONALMENTE
                    switch (patron[i][j]) {
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1000:
                            System.out.print("\\");
                            break;
                        case 2000:
                            System.out.print("/");
                            break;
                        case 3000:
                            System.out.print("X");
                            break;
                        default:
                            System.out.print(" ");
                            break;
                    }
                }
            }
            System.out.println("|");
        }
        // MARCO INFERIOR
        System.out.print("+");
        for (int i = 0; i < columnas; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
