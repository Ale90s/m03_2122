import java.io.*;

public class lolEquipos2022 {
    public static void main(String[] args) throws IOException {

        String pathLectura = "D:\\thiri\\desktop\\resultatsLOL.txt";
        Competicion[] equipos = new Competicion[10];

        lectura(pathLectura, equipos);

        imprimeEquipos(equipos);
    }

    public static void lectura(String path, Competicion[] equipos) throws IOException {

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        boolean equiposMetidos = false;
        String aux[];
        int posicion = 0, posA = 0, posB = 0;

        while ((linea = archivo.readLine()) != null) {

            if (!linea.equals("")) {

                aux = linea.split("[:-]+");

                if (equiposMetidos) {
                    for (int i = 0; i < equipos.length; i++) {
                        if (aux[0].equals(equipos[i].getNomEquipos())) {
                            posA = i;
                        } else if (aux[2].equals(equipos[i].getNomEquipos())) {
                            posB = i;
                        }
                    }
                } else {
                    equipos[posicion] = new Competicion(aux[0], 0, 0, 0);
                    posA = posicion;
                    posicion++;

                    equipos[posicion] = new Competicion(aux[2], 0, 0, 0);
                    posB = posicion;
                    posicion++;
                }

                if (Integer.parseInt(aux[1]) > Integer.parseInt(aux[3])) {
                    equipos[posA].setTotal_punts(equipos[posA].getTotal_punts() + 1);
                    equipos[posA].setTotal_Victories(equipos[posA].getTotal_Victories() + 1);
                    equipos[posB].setTotal_derrotes(equipos[posB].getTotal_derrotes() + 1);
                } else {
                    equipos[posB].setTotal_punts(equipos[posB].getTotal_punts() + 1);
                    equipos[posB].setTotal_Victories(equipos[posB].getTotal_Victories() + 1);
                    equipos[posA].setTotal_derrotes(equipos[posA].getTotal_derrotes() + 1);
                }

            } else {
                equiposMetidos = true;
            }
        }
        ordenaBombolla(equipos);
        archivo.close();
    }

    public static void imprimeEquipos(Competicion[] equipos) {

        for (int i = 0; i < equipos.length; i++) {

            System.out.println("EQUIPO NUMERO" + (i + 1));
            System.out.println("Nombre equipo: " + equipos[i].getNomEquipos());
            System.out.println("Puntos: " + equipos[i].getTotal_punts());
            System.out.println("Victorias: " + equipos[i].getTotal_Victories());
            System.out.println("Derrotas: " + equipos[i].getTotal_derrotes());
            System.out.println();
        }
    }

    public static void ordenaBombolla(Competicion[] equipos) {

        boolean swap;
        Competicion auxMenor;
        int aux = equipos.length;

        do {
            swap = false;
            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && equipos[i].getTotal_punts() < equipos[i + 1].getTotal_punts()) {
                    auxMenor = equipos[i];
                    equipos[i] = equipos[i + 1];
                    equipos[i + 1] = auxMenor;

                    swap = true;
                }
            }
            aux--;

        } while (swap);

    }
}