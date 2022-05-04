package juego;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\thiri\\Documents\\compartir\\codis.txt";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        int[] unos = new int[12];
        int[] ceros = new int[12];
        int[] resultado = new int[12];

        while ((linea = archivo.readLine()) != null) {

            for (int i = 0; i < linea.length(); i++) {

                if (linea.charAt(i) == '0') {
                    ceros[i]++;
                } if (linea.charAt(i) == '1'){
                    unos[i]++;
                }
            }
        }

        for (int i = 0; i < unos.length; i++) {

            if (ceros[i] > unos[i]) {
                resultado[i] = 0;
            } else {
                resultado[i] = 1;
            }

        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]);
        }
        System.out.println("");

    }
}
