package m03.uf1.a5;

import java.util.Scanner;

public class Ex06_TrobarValorVector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numeroAEncontrar;
        String entradaNumeros;
        String[] numerosAArray;
        System.out.println("Introdueix una llista de nombres separats per espais"
                + " i un -1 per finalitzar:");

        do {
            entradaNumeros = in.nextLine();
            //Hasta que no acabe en -1 que no salga del bucle
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
        System.out.print("Valor a trobar: ");
        numeroAEncontrar = in.nextInt();
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {

            if (numeroAEncontrar == numeros[i]) {
                System.out.printf("%d trobat a la posició %d%n", numeroAEncontrar, i);
            }
        }

    }
}
