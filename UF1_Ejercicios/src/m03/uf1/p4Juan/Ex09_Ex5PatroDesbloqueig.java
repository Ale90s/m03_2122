package m03.uf1.p4Juan;

import java.util.Scanner;

public class Ex09_Ex5PatroDesbloqueig {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int files = entrada.nextInt();
        int columnes = entrada.nextInt();
        entrada.nextLine();

        char[][] patroDesbloqueig = new char[2 * files - 1][2 * columnes - 1];

        int x0 = entrada.nextInt();
        int y0 = entrada.nextInt();
        entrada.nextLine();

        String cadenaDesbloqueig = entrada.nextLine();
        entrada.close();
        /* Inicialitzem la matriu de desbloqueig:
            a) Amb un punt ('.') si és una posició que correspon a un nombre (1..5)
            b) Amb un espai en blanc (' ') si és una altra posició
                    
         */
        for (int i = 0; i < files * 2 - 1; ++i) {
            for (int j = 0; j < columnes * 2 - 1; ++j) {
                if (i % 2 == 0 && j % 2 == 0) {
                    patroDesbloqueig[i][j] = '.';
                } else {
                    patroDesbloqueig[i][j] = ' ';
                }
            }
        }

        int posX = 2 * x0 - 2, posY = 2 * y0 - 2;
        patroDesbloqueig[posX][posY] = 'O';
        for (char caracter : cadenaDesbloqueig.toCharArray()) {
            switch (caracter) {
                case '1':
                    if (patroDesbloqueig[posX - 1][posY - 1] == ' ' || patroDesbloqueig[posX - 1][posY - 1] == '\\') {
                        patroDesbloqueig[posX - 1][posY - 1] = '\\';
                    } else if (patroDesbloqueig[posX - 1][posY - 1] == '/') {
                        patroDesbloqueig[posX - 1][posY - 1] = 'X';
                    }
                    posX -= 2;
                    posY -= 2;
                    break;
                case '2':
                    patroDesbloqueig[posX - 1][posY] = '|';
                    posX -= 2;
                    break;
                case '3':
                    if (patroDesbloqueig[posX - 1][posY + 1] == ' ' || patroDesbloqueig[posX - 1][posY + 1] == '/') {
                        patroDesbloqueig[posX - 1][posY + 1] = '/';
                    } else if (patroDesbloqueig[posX - 1][posY + 1] == '\\') {
                        patroDesbloqueig[posX - 1][posY + 1] = 'X';
                    }
                    posX -= 2;
                    posY += 2;
                    break;
                case '4':
                    patroDesbloqueig[posX][posY - 1] = '-';
                    posY -= 2;
                    break;
                case '6':
                    patroDesbloqueig[posX][posY + 1] = '-';
                    posY += 2;
                    break;
                case '7':
                    if (patroDesbloqueig[posX + 1][posY - 1] == ' ' || patroDesbloqueig[posX + 1][posY - 1] == '/') {
                        patroDesbloqueig[posX + 1][posY - 1] = '/';
                    } else if (patroDesbloqueig[posX + 1][posY - 1] == '\\') {
                        patroDesbloqueig[posX + 1][posY - 1] = 'X';
                    }
                    posX += 2;
                    posY -= 2;
                    break;
                case '8':
                    patroDesbloqueig[posX + 1][posY] = '|';
                    posX += 2;
                    break;
                case '9':
                    if (patroDesbloqueig[posX + 1][posY + 1] == ' ' || patroDesbloqueig[posX + 1][posY + 1] == '\\') {
                        patroDesbloqueig[posX + 1][posY + 1] = '\\';
                    } else if (patroDesbloqueig[posX + 1][posY + 1] == '/') {
                        patroDesbloqueig[posX + 1][posY + 1] = 'X';
                    }
                    posX += 2;
                    posY += 2;
                    break;
            }
            patroDesbloqueig[posX][posY] = 'O';
        }

        //Mostra el patró de desbloqueig
        System.out.print("+");
        for (int i = 0; i < 2 * columnes - 1; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
        for (char[] fila : patroDesbloqueig) {
            System.out.print("|");
            for (char columna : fila) {
                System.out.print(columna);
            }

            System.out.println("|");
        }
        System.out.print("+");
        for (int i = 0; i < 2 * columnes - 1; ++i) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
