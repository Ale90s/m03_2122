import java.util.Scanner;

public class Pruebas1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while (n != 0) {

            int numeros[] = new int[n];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = in.nextInt();
            }

            int mayor = -2147483648;

            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    if (i != j) {
                        if (numeros[i] * numeros[j] > mayor) {
                            mayor = numeros[i] * numeros[j];
                        }
                    }
                }
            }
            System.out.println(mayor);
            n = in.nextInt();
        }
        in.close();
    }
}
