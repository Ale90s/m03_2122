package m03.uf1.pa2.alejandroalgarra;

import java.util.Scanner;

public class Fruiteria {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] producto = {"taronja", "poma", "pera", "mandarina", "maduixa", "platan"};
        double[] precioKg = {1.55, 1.99, 2.4, 1.8, 5, 2.2};
        String frase;
        double peso;
        double precioTotal = 0;
        int posicion = -1;
        boolean articleFound = false;
        boolean acaba = false;

        /*
         * posicion - POSICION DEL ARRAY DE STRING PARA COGER PRECIO DEL ARRAY DOUBLE
         *
         * articleFound - EN CASO DE QUE EXISTA EL PRODUCTE articleFound = true
         *
         * acaba - EN CASO DE QUE ENTRE "" QUE ACABE EL PROGRAMA
         */
        System.out.println("Indiqui els articles i el pes (linia en blanc per finalitzar):");

        do {
            System.out.print("Article: ");
            frase = in.nextLine();
            if (frase.equals("")) {

                acaba = true;
            }
            if (!acaba) {
                for (int i = 0; i < producto.length; i++) {

                    if (frase.equals(producto[i])) {
                        posicion = i;
                        articleFound = true;
                    }
                }
                if (articleFound) {

                    System.out.print("Pes: ");
                    peso = in.nextDouble();
                    in.nextLine(); // VACIAMOS BUFFER
                    precioTotal += peso * precioKg[posicion];

                } else {

                    System.out.println("ERROR, article no disponible");

                }
                posicion = -1;
                peso = 0;
                articleFound = false;
            }
        } while (!acaba);

        System.out.println("");

        if (precioTotal != 0) {
            System.out.printf("Total: %.2f€%n", precioTotal);
        }
    }
}
