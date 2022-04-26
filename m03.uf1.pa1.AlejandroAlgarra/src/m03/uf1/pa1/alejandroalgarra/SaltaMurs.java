package m03.uf1.pa1.alejandroalgarra;

import java.util.Scanner;

public class SaltaMurs {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroMuros, alcadaMurs, contadorArriba = 0, contadorAbajo = 0,
                muroAnterior = 0, muroSiguiente = 0;

        System.out.printf("Introdueix el nombre de murs: ");
        numeroMuros = in.nextInt();
        System.out.printf("Indiqui l'alçada dels murs: ");

        for (int i = 0; i < numeroMuros; i++) {

            alcadaMurs = in.nextInt();

            muroAnterior = muroSiguiente;
            muroSiguiente = alcadaMurs;

            if (i == 0) {
                //no hace nada porque la primera vuelta no hay muros que comparar
            } else {
                if (muroSiguiente > muroAnterior) {

                    contadorArriba++;
                    // En caso de que el muro sea mayor al anterior (Tiene que saltar hacia arriba)
                } else if (muroSiguiente < muroAnterior) {

                    contadorAbajo++;
                    // En caso de que el muro sea mayor al anterior (Tiene que saltar hacia abajo)
                }
            }
        }
        System.out.printf("Nombre de salts cap amunt: %d%n", contadorArriba);
        System.out.printf("Nombre de salts cap avall: %d%n", contadorAbajo);
    }
}
