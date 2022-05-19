import java.io.*;

public class lolEquipos2022 {
    public static void main(String[] args) throws IOException {

        String pathLectura = "D:\\thiri\\desktop\\resultatsLOL.txt";
        // String pathEscritura = "C:\\Users\\aalgarra\\Desktop\\resultadosCompeti.txt";
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
        int posicion = 0, posA, posB;

        while ((linea = archivo.readLine()) != null) {

            if (!linea.equals("")) {

                aux = linea.split("[:-]+");

                if (equiposMetidos) {
                    for (int i = 0; i < aux.length; i++) {
                        if (aux[0].equals(equipos[i].getNomEquipos())) {
                            posA = i;
                        } else if (aux[2].equals(equipos[i].getNomEquipos())) {
                            posB = i;
                        }
                    }
                } else {
                    equipos[posicion] = new Competicion();
                    equipos[posicion].setNomEquipos(aux[0]);
                    equipos[posicion].setTotal_punts(0);
                    equipos[posicion].setTotal_Victories(0);
                    equipos[posicion].setTotal_derrotes(0);
                    posA = posicion;
                    posicion++;
                    equipos[posicion] = new Competicion();
                    equipos[posicion].setNomEquipos(aux[2]);
                    equipos[posicion].setTotal_punts(0);
                    equipos[posicion].setTotal_Victories(0);
                    equipos[posicion].setTotal_derrotes(0);
                    posB = posicion;
                    posicion++;
                }

                if (Integer.parseInt(aux[1]) > Integer.parseInt(aux[2])) {

                } else {

                }

            } else {
                equiposMetidos = true;
            }
        }
        archivo.close();
    }

    public static void imprimeEquipos(Competicion[] equipos) {

        for (int i = 0; i < equipos.length; i++) {

            System.out.println("Nombre equipo: " + equipos[i].getNomEquipos());
            /*
             * System.out.println("Puntos: " + equipos[i].getTotal_punts());
             * System.out.println("Victorias: " + equipos[i].getTotal_Victories());
             * System.out.println("Derrotas: " + equipos[i].getTotal_derrotes());
             */
        }
    }
}