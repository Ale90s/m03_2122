package m03.uf1.p4;

import java.util.Scanner;

public class Ex02_TrobaValoVector2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroAEncontrar;
        String entradaNumeros;
        String[] numerosAArray;

        do {

            entradaNumeros = in.nextLine();

        } while (!entradaNumeros.endsWith("-1"));

        numerosAArray = entradaNumeros.split(" ");
        //Del string que entró por el scanner que se separe por los espacios y 
        //se convierta en un array
        int[] numeros = new int[numerosAArray.length - 1];
        //Le damos tamaño a un array de integer

        for (int i = 0; i < numerosAArray.length - 1; i++) {

            numeros[i] = Integer.parseInt(numerosAArray[i]);
            //Pasamos el array de String a int
        }

        numeroAEncontrar = in.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeroAEncontrar == numeros[i]) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
    }
}
