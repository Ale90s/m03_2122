package m03uf4p1.Personatges;

public class CreaPersonajes {
    public static void main(String[] args) {

        double[] dados = new double[3];
        tiradasDados(dados);

        for (int i = 0; i < dados.length; i++) {
            System.out.printf("%.0f%n", dados[i]);
        }

    }

    public static void tiradasDados(double[] dados) {

        for (int i = 0; i < dados.length; i++) {

            dados[i] = Math.floor(Math.random() * (25 - 1 + 1) + 1);

        }

    }

}
