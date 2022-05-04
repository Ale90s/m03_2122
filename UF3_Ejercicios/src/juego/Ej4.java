package juego;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\thiri\\Documents\\compartir\\masmorra.txt";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        boolean ultimoColumna = false;
        boolean ultimoPunto = false;
        boolean finalColumna = true;
        int contador = 0;

        while ((linea = archivo.readLine()) != null) {

            for (int i = 0; i < linea.length(); i++) {

                if (linea.charAt(i) == '#') {
                    if (ultimoPunto && !finalColumna) {
                        contador++;
                    }
                    ultimoColumna = true;
                    ultimoPunto = false;
                    finalColumna = false;
                } else if (linea.charAt(i) == '.') {
                    ultimoColumna = false;
                    ultimoPunto = true;
                    finalColumna = false;
                }
            }
            if (linea.charAt(linea.length() - 1) == '#') {
                finalColumna = true;
            }
        }

        System.out.println(contador);

    }
}
