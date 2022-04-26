package m03.uf1.a5;

import java.util.Scanner;

public class Ex13_VectorsParalels {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] idUsuario = {1400, 3442, 3783, 4593, 2344, 4999, 1192, 3021, 1023,
            4891};
        String[] nom = {"Bjorn", "Helge", "Hans", "Harald", "Ivar", "Jensen",
            "Olson", "Sven", "Sigurd", "Niels"};
        String[] primerCognom = {"Aaberg", "Aland", "Alfson", "Axel", "Backe", "Beck",
            "Bell", "Bengtsson", "Berg", "Bielke"};
        String[] segonCognom = {"Bjerke", "Blom", "Bonde", "Borg",
            "Marca", "Breiner", "Bunderson", "Carlson", "Christensen", "Dahl"};
        int fila, usuarioElegido = 0;
        boolean usuarioRegistrado = false;

        System.out.print("Indiqui el id a cercar: ");
        fila = in.nextInt();
        System.out.printf("Usuario %s: ", fila);

        for (int i = 0; i < idUsuario.length && !usuarioRegistrado; i++) {

            if (fila == idUsuario[i]) {
                usuarioRegistrado = true;
                usuarioElegido = i;
            }
        }

        if (usuarioRegistrado) {
            System.out.printf("%s %s %s%n", nom[usuarioElegido],
                    primerCognom[usuarioElegido], segonCognom[usuarioElegido]);
        } else {
            System.out.println("No trobat");
        }

    }
}
