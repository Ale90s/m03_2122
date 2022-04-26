package m03.uf1.a1;

import java.util.Scanner;

public class Ex12_Tetraedre {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double aresta, superficie, volum;
        
        System.out.println("Introdueix l'aresta del tetraedre:");
        aresta = in.nextDouble();
        System.out.println("");
        
        superficie = Math.sqrt(3)*Math.pow(aresta, 2);
        System.out.println("La superfície del tetraedre és: " + superficie);
        volum = Math.pow(aresta, 3)/(6*Math.sqrt(2));
        System.out.println("El volum del tetraedre és: " + volum);
    }

    
    
}
