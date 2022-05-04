package juego;

import java.io.*;

public class Ej1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\thiri\\Documents\\compartir\\mesures.txt";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        int posicion = 0;
        int suma = 0;
        int nA = 0, nB = 0;
        

        while ((linea = archivo.readLine()) != null) {

            if (posicion % 2 == 0) {
                nA = Integer.parseInt(linea);
            } else {
                nB = Integer.parseInt(linea);
            }

            if (posicion > 0) {
                if (posicion % 2 == 0) {
                    if (nA > nB) {
                        suma++;
                    }
                } else {
                    if (nA < nB) {
                        suma++;
                    }
                }

            }

            posicion++;
        }
        System.out.println(suma);
    }
}
