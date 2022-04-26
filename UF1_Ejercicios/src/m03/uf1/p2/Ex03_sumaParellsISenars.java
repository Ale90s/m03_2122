package m03.uf1.p2;

import java.util.Scanner;

public class Ex03_sumaParellsISenars {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n, contadorParells = 0, contadorSenars = 0;
        
        n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            if (i % 2 == 0) {
                contadorParells = contadorParells + i;
            } else if (i % 2 != 0) {
                contadorSenars = contadorSenars + i;
            }
        }
        System.out.printf("Suma parells: %d%n", contadorParells);
        System.out.printf("Suma senars: %d%n", contadorSenars);
    }
}
