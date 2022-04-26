package m03.uf1.a1;

import java.util.Scanner;

public class Ex16_Kilometres2Milles {
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float kilometres, milles;
        
        System.out.print("Introdueixi distància en kilòmetres: ");
        kilometres = in.nextFloat();

        milles = kilometres/1.609f;
        System.out.printf("La distància en milles és: %.3f%n", milles);
    }
    
}
