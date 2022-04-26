package m03.uf1.a3;

import java.util.Scanner;

public class numFactorial {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce un número natural: ");
        int i, factorial;
        int valor = in.nextInt();
        
        for (i=1, factorial=1; i<=valor; i++) {
            factorial = factorial * i;
        }
        System.out.println(valor + " != " + factorial);
    }
}
