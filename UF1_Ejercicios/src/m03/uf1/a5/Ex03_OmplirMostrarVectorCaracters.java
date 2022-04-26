package m03.uf1.a5;

public class Ex03_OmplirMostrarVectorCaracters {

    public static void main(String[] args) {

        char[] caracteres = new char[10];
        char inicioArray = '\u0061';

        for (int i = 0; i < caracteres.length; i++) {

            caracteres[i] = inicioArray;
            inicioArray += 1;

        }

        for (int i = 0; i < caracteres.length; i++) {

            System.out.printf("El valor de la posició %d es: %c%n", i, caracteres[i]);

        }
    }
}
