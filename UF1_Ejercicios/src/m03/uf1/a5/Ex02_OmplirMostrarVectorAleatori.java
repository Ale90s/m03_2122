package m03.uf1.a5;

public class Ex02_OmplirMostrarVectorAleatori {

    public static final int MAX = 99;
    public static final int MIN = 10;

    public static void main(String[] args) {

        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {

            numero[i] = MIN + (int) (Math.random() * (MAX - MIN + 1));
        }
        for (int i = 0; i < numero.length; i++) {

            System.out.printf("El valor de la posició %d es: %d%n", i, numero[i]);
        }
    }
}
