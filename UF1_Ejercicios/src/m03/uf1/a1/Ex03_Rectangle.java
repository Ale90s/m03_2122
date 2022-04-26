package m03.uf1.a1;
        
import java.util.Scanner;

public class Ex03_Rectangle {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        double alcada, amplada, perimetre, superficie;
        
        System.out.println("Introdueix l'alçada del rectangle: ");
        alcada = in.nextDouble();
        System.out.println("Introdueix l'amplada del rectangle: ");
        amplada = in.nextDouble();
        
        perimetre = 2*(alcada+amplada);
        System.out.println("El perímetre del rectangle és:  " + perimetre);
        superficie = alcada*amplada;
        System.out.println("La superfície del rectangle és: " + superficie);
    }

}
