package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex340_CuadradosConCerillas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int resultado;

        for (int i = 0; i < n; i++) {

            int vertical = in.nextInt(), horizontal = in.nextInt();

            resultado = (horizontal * (vertical + 1)) + (vertical * (horizontal + 1));
            System.out.println(resultado);
        }
    }
}
