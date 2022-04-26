package m03.uf1.a1;

import java.util.Scanner;

public class Ex11_Hexaedre {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double aresta, superficie, volum;
        
        System.out.println("Introdueix l'aresta de l'hexaedre:");
        aresta = in.nextDouble();
        
        superficie = 6*Math.pow(aresta, 2);
        System.out.println("");
        System.out.println("La superfície de l'hexaedre és: " + superficie);
        
        volum = Math.pow(aresta, 3);
        System.out.println("El volum de l'hexaedre és: " + volum);
        
        
    }
    
}
