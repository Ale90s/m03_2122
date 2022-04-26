package m03.uf1.a3;

import java.util.Scanner;

public class numerosFactoriales {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce un número natural: ");
        int i, factorial, n;
        int valor = in.nextInt();
        
        for (n = 1; n<=10; n++) {
            for (i=1, factorial=1; i<=n; i++) {
            factorial = factorial * i;
           }
            System.out.println(n + "!= " + factorial);
        }
    }
}
