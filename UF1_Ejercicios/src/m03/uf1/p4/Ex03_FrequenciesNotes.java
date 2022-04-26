package m03.uf1.p4;

import java.util.Scanner;

public class Ex03_FrequenciesNotes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero, posicion;
        int []numeros = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        boolean fueraRango = false;

        do {
                
                numero = in.nextInt();
                
                if(numero <= 10 && numero >= 0) {
                    
                    numeros[numero]++;
                }
                
        } while (numero <= 10 && numero >= 0);

        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
        }
    }
}
