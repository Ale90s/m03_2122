package m03.uf1.a5;

import java.util.Scanner;

public class Ex07_TrobaMajorMenorVector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String entradaNumeros;
        String[] numerosArray;
        int valorMayor = 0, valorMenor = 0, posicionValorMayor = 0,
                posicionValorMenor = 0;

        System.out.println("Introdueix en una línia una llista de nombres"
                + " separats per comes:");
        entradaNumeros = in.nextLine();
        System.out.println("");

        numerosArray = entradaNumeros.split(",");
        int numeros[] = new int[numerosArray.length];

        for (int i = 0; i < numerosArray.length; i++) {

            numeros[i] = Integer.parseInt(numerosArray[i]);
            //Pasamos el Array de strings de numeros a un Array de integer
            if (i == 0) {
                valorMayor = numeros[i];
                valorMenor = numeros[i];
                //Le damos un primer valor a las dos variables de los valores
                //para que se inicialicen y no falsee el 0 inicial
            }

            if (numeros[i] > valorMayor) {
                valorMayor = numeros[i];
                posicionValorMayor = i;
            }
            if (numeros[i] < valorMenor) {
                valorMenor = numeros[i];
                posicionValorMenor = i;
            }
        }

        System.out.printf("Valor més gran: %d a la posició %d%n",
                valorMayor, posicionValorMayor);
        System.out.printf("Valor més petit: %d a la posició %d%n",
                valorMenor, posicionValorMenor);
    }
}
