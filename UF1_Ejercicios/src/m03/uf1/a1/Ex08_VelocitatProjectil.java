package m03.uf1.a1;

import java.util.Scanner;

public class Ex08_VelocitatProjectil {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double km, segons, metros, velocitat;

        System.out.println("Quin espai ha recorregut el projectil (en km)?");
        km = in.nextDouble(); //Usuario especifica km recorridos

        System.out.println("Quant temps ha trigat (en segons)?");
        segons = in.nextDouble(); //Usuario especifica segundos

        metros = km * 1000; //Pasamos kilometros a metros
        velocitat = metros / segons; //Sacamos la velocidad en m/s

        System.out.println("La velocitat del projectil has estat: " + velocitat
                + " m/s");
    }

}
