package p1.Armas;

public class test {

    public static void main(String[] args) {

        int[] dados = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        tiradasDados(dados);

        for (int i = 0; i < dados.length; i++) {
            System.out.println(dados[i]);
        }

    }

    public static void tiradasDados(int[] dados) {

        for (int i = 0; i < dados.length; i++) {
            dados[i] = (int) Math.floor(Math.random() * (25 - 1 + 1) + 1);
        }
    }
}
