package m03.uf1.a1;

import java.util.Scanner;

public class Ex10_Cilindre {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double radi, alcada, superficie, volum;
        
        System.out.println("Introdueix el radi del cilindre: ");
        radi = in.nextDouble();
        System.out.println("Introdueix l'alçada del cilindre: ");
        alcada = in.nextDouble();
        
        superficie = 2*Math.PI*radi*alcada + 2*Math.PI*Math.pow(radi, 2);
            //Fórmula superficie de un cilindro
        System.out.println("La superfície del cilindre és: " + superficie);
        
        volum = Math.PI*alcada*Math.pow(radi, 2);
            //Fórmula volum de un cilindro
        System.out.println("El volum del cilindre és: " + volum);
        
    }
    
}
