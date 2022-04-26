package m03.uf1.a5;

public class Ex01_OmplirMostrarVector {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = 100 + i;

        }

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("El valor de la posició %d és: %d%n", i, numeros[i]);

        }
    }
}
