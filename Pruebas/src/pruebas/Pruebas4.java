package pruebas;

import java.util.Scanner;

public class Pruebas4 {

    public static void main(String[] args) {
        
        int a = 5, b = 0, aux = a;
        
        for (int i = 0; i < 10; i++) {
            
            a++;
            
            if(a == aux + 3) {
                a = 0;
                b++;
            }
            
        }
    }
}
