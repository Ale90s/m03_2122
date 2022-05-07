package p1;

import java.io.*;
import java.util.*;

public class Pruebas {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\thiri\\Documents\\Compartir\\resultatsLOL.txt";

        HashMap<String, Integer> clasiLol = lectura(path);

        String[] equipos = clasiLol.toString().split(", |=|\\{|\\}");

        System.out.println(clasiLol);

        for (int i = 0; i < equipos.length; i++) {
            System.out.println(equipos[i]);
        }

    }

    public static HashMap<String, Integer> lectura(String path) throws FileNotFoundException, IOException {

        // CREAMOS UN HashMap (tiene una clave primaria y un contenido que le acompaña)
        HashMap<String, Integer> equipos = new HashMap<>();

        // CREAMOS EL ARCHIVO Y UN STRING QUE SERÁ LA VARIABLE DONDE SE GUARDARÁ CADA LÍNEA
        // LEÍDA DEL FICHERO
        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        // CREAMOS DOS ARRAYS DONDE SE GUARDARÁN LOS NOMBRES DEL EQUIPO Y LA PUNTUACIÓN
        String[] nEquipos = new String[10];
        int[] puntosEquipos = new int[10];
        // ARRAY AUXILIAR CON EL QUE HAREMOS UN .split DE LA LINEA LEIDA EN EL FICHERO
        String[] aux;
        // INT QUE GUARDARÁN EN QUE POSICIÓN ESTÁ CADA EQUIPO PARA LUEGO COMPARARLO
        // CON LOS PUNTOS Y posicion QUE SE UTILIZA CUANDO SE ESTÁ LLENANDO EL ARRAY
        int equipoA = 0, equipoB = 0, posicion = 0;
        boolean equiposDone = false;

        while ((linea = archivo.readLine()) != null) {

            if (!linea.equals("")) {
                aux = linea.split("[:-]+");

                if (equiposDone) {
                    for (int i = 0; i < nEquipos.length; i++) {

                        if (aux[0].equals(nEquipos[i])) {
                            equipoA = i;
                        } else if (aux[2].equals(nEquipos[i])) {
                            equipoB = i;
                        }
                    }
                } else {

                    nEquipos[posicion] = aux[0];
                    equipoA = posicion;

                    posicion++;

                    nEquipos[posicion] = aux[2];
                    equipoB = posicion;

                    posicion++;

                }

                if (Integer.parseInt(aux[1]) > Integer.parseInt(aux[3])) {
                    puntosEquipos[equipoA]++;
                } else {
                    puntosEquipos[equipoB]++;
                }

            } else {
                equiposDone = true;
            }
        }

        for (int i = 0; i < nEquipos.length; i++) {

            equipos.put(nEquipos[i], puntosEquipos[i]);

        }
        return equipos;

    }

    public static void escritura(HashMap<String, Integer> equipos, String path) {
        
        
        
    }
}
