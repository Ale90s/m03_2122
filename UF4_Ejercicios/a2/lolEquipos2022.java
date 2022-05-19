import java.util.*;
import java.io.*;

public class lolEquipos2022 {
    public static void main(String[] args) throws IOException {

        String pathLectura = "C:\\Users\\aalgarra\\Desktop\\resultatsLOL.txt";
        String pathEscritura = "C:\\Users\\aalgarra\\Desktop\\resultadosCompeti.txt";

        Competicion[] equipos = lectura(pathLectura);

        escritura(pathEscritura, equipos);
    }

    public static Competicion[] lectura(String path) throws IOException {

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        boolean equiposMetidos = false;
        String aux[];
        String equipoA, equipoB;

        while ((linea = archivo.readLine()) != null) {

            if (!linea.equals("")) {

                aux = linea.split("[:-]+");

                equipoA = aux[0];
                equipoB = aux[2];

                if (equiposMetidos) {

                } else {

                    

                }
            } else {
                equiposMetidos = true;
            }
        }

        Competicion test = new Competicion();

        Competicion[] equipos = { test };

        return equipos;
    }

    public static void escritura(String path, Competicion[] equipos) {
    }

}