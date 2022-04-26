package m03.uf1.a5;

import java.util.Scanner;

public class Ex15_EspecificacionArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Introdueix la mida de la matriz: [2-10]: ");
        int mida = in.nextInt();
        int[][] matriz = new int[mida][mida];
        int suma = 0;
        
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                int n = (int) (Math.random() * 9) + 1;
                matriz[i][j] = n;
                System.out.print(matriz[i][j] + " ");
                
                if(i + j == mida - 1) {
                    suma += matriz[i][j];
                }
            }
            System.out.println("");
        }
        
        System.out.printf("Suma en diagonal inversa: %d%n", suma);
    }
}
