package m03.uf1.a1;

import java.util.Scanner;

public class Ex07_Triangleisosceles {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double alcada, amplada, perimetre, superficie, cateto;

        System.out.println("Introdueix l'alçada del triangle isòsceles: ");
        alcada = in.nextDouble(); //Usuario introduce alçada
        System.out.println("Introdueix l'amplada del triangle isòsceles: ");
        amplada = in.nextDouble(); //Usuario introduce amplada

        cateto = Math.sqrt(Math.pow(alcada, 2) + Math.pow((amplada / 2), 2));
        //Calculamos con el teorema de pitágoras el lado que desconocíamos

        perimetre = (cateto * 2) + amplada; //Fórmula perímetre
        System.out.println("El perímetre del triangle és: " + perimetre);

        superficie = (alcada * amplada) / 2; //Fórmula superfície
        System.out.println("La superfície del triangle és: " + superficie);
    }

}

