import java.io.*;

public class lolEquipos2022 {
    public static void main(String[] args) throws IOException {

        String pathLectura = "D:\\thiri\\desktop\\resultatsLOL.txt";
        // String pathEscritura = "C:\\Users\\aalgarra\\Desktop\\resultadosCompeti.txt";
        Competicion[] equipos = new Competicion[10];

        lectura(pathLectura, equipos);
    }

    public static void lectura(String path, Competicion[] equipos) throws IOException {

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        boolean equiposMetidos = false;
        String aux[];
        int contador = 0;

        while ((linea = archivo.readLine()) != null) {

            if (!linea.equals("")) {

                aux = linea.split("[:-]+");

                if (equiposMetidos) {

                } else {
                    equipos[contador].setNomEquipos(aux[0]);
                    contador++;
                    equipos[contador].setNomEquipos(aux[0]);
                    contador++;
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
            /*System.out.println("Puntos: " + equipos[i].getTotal_punts());
            System.out.println("Victorias: " + equipos[i].getTotal_Victories());
            System.out.println("Derrotas: " + equipos[i].getTotal_derrotes());
*/
        }
    }
}