package p1;

import java.io.*;
import java.util.*;

public class Ex01_P1 {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\thiri\\Documents\\Compartir\\resultatsLOL.txt";

        lectura(path);

    }

    public static void lectura(String path) throws FileNotFoundException, IOException {

        
        
        Map<String, Integer> equipos = new HashMap<>(10);
        
//        Map equiposs = new HashMap();
        
        
        
        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        String[] nEquipos = new String[10];
        int[] puntosEquipos = new int[10];
        String[] aux;
        int equipoA = 0, equipoB = 0, posicion = 0;
        boolean teamA = false, teamB = false;

        while ((linea = archivo.readLine()) != null) {
            
            if (!linea.equals("")) {
                aux = linea.split("[:-]+");

                for (int i = 0; i < nEquipos.length; i++) {

                    if (aux[0].equals(nEquipos[i])) {

                        equipoA = i;
                        teamA = true;

                    } else if (aux[2].equals(nEquipos[i])) {

                        equipoB = i;
                        teamB = true;
                    }
                }
                if (!teamA) {

                    nEquipos[posicion] = aux[0];
                    equipoA = posicion;
                    posicion++;
                }
                if (!teamB) {

                    nEquipos[posicion] = aux[2];
                    equipoB = posicion;
                    posicion++;
                }
                if (Integer.parseInt(aux[1]) > Integer.parseInt(aux[3])) {

                    puntosEquipos[equipoA]++;
                } else {

                    puntosEquipos[equipoB]++;
                }
                teamA = false;
                teamB = false;
            }
        }
        
        
        
        for (int i = 0; i < nEquipos.length; i++) {
            
            equipos.put(nEquipos[i], puntosEquipos[i]);
            System.out.print(nEquipos[i]);
            System.out.println(" " + puntosEquipos[i]);

        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(equipos);
        }
    }
}
