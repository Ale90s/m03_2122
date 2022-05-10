import java.io.*;
import java.util.*;

public class Ex01_P1 {

    public static void main(String[] args) throws IOException {

        // CAMBIAR ESTA RUTA PARA ELEGIR LA UBICACIÓN DEL FICHERO
        String pathLectura = "/home/aalgarra/Desktop/resultatsLOL.txt";
        String pathEscritura = "/home/aalgarra/Desktop/classificacioLOL.txt";

        HashMap<String, Integer> clasiLol = lectura(pathLectura);
        escritura(clasiLol, pathEscritura);

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
                        // PRIMERO METEMOS LOS EQUIPOS EN EL ARRAY
                        if (aux[0].equals(nEquipos[i])) {
                            equipoA = i;
                        } else if (aux[2].equals(nEquipos[i])) {
                            equipoB = i;
                        }
                    }
                } else {
                    // DESPUES METEMOS LAS PUNTUACIONES
                    nEquipos[posicion] = aux[0];
                    equipoA = posicion;

                    posicion++;

                    nEquipos[posicion] = aux[2];
                    equipoB = posicion;

                    posicion++;

                }
                // COMPARAMOS PUNTUACIONES ENTRE EQUIPOS
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
            // METEMOS LA INFORMACIÓN DE LOS DOS ARRAYS EN EL MAPA
            equipos.put(nEquipos[i], puntosEquipos[i]);

        }
        archivo.close();
        return equipos;
        
    }

    public static void escritura(HashMap<String, Integer> clasiLol, String path) throws IOException {

        // PASAMOS EL HashMap A UN ARRAY
        String[] equipos = clasiLol.toString().split(", |=|\\{|\\}");
        // ARRAYS DONDE GUARDAREMOS EL CONTENIDO DEL HashMap
        String[] nombreEquipos = new String[10];
        int[] puntuacion = new int[10];

        int aux = 0;
        //PASAMOS EL CONTENIDO DEL HashMap A LOS ARRAYS
        for (int i = 1; i < equipos.length - 1; i += 2) {

            nombreEquipos[aux] = equipos[i];
            puntuacion[aux] = Integer.parseInt(equipos[i + 1]);

            aux++;
        }

        boolean swap;
        int menor;
        String auxMenor;
        aux = puntuacion.length;

        // METODO BURBUJA
        do {
            swap = false;
            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && puntuacion[i] < puntuacion[i + 1]) {
                    menor = puntuacion[i];
                    puntuacion[i] = puntuacion[i + 1];
                    puntuacion[i + 1] = menor;

                    auxMenor = nombreEquipos[i];
                    nombreEquipos[i] = nombreEquipos[i + 1];
                    nombreEquipos[i + 1] = auxMenor;

                    swap = true;
                }
            }
            aux--;

        } while (swap);
        // FINAL METODO BURBUJA

        try ( FileWriter output = new FileWriter(path);  BufferedWriter fichero = new BufferedWriter(output)) {

            for (int i = 0; i < nombreEquipos.length; i++) {

                fichero.write(nombreEquipos[i] + " -> " + puntuacion[i] + "\n");

            }

            System.out.println("La escritura del archivo se ha realizado correctamente.");

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
