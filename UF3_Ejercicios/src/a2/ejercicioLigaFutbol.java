package a2;

import java.io.*;

public class ejercicioLigaFutbol {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\thiri\\Documents\\compartir\\resultats.txt";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        String[] equipos = new String[20];
        String[] puntos = new String[20];
        int pos = 0;

        String[] aux;
        String[] aux2;

        while ((linea = archivo.readLine()) != null) {

            System.out.println(linea);

            aux = linea.split("-");

            for (int i = 0; i < aux.length; i++) {

                aux2 = aux[i].split(":");
                equipos[pos] = aux2[0];
                puntos[pos] = aux2[1];
                pos++;

            }
        }
        System.out.println("");
        System.out.println("");
        ordenaBombolla(puntos, equipos);
    }

    public static void ordenaBombolla(String[] puntos, String[] equipos) throws IOException {

        boolean continua;
        String mayor;
        String equipoMayor;
        int aux = puntos.length;

        do {

            continua = false;

            for (int i = 0; i < aux; i++) {

                if (i < aux - 1 && puntos[i].compareTo(puntos[i + 1]) > 0) {
                    mayor = puntos[i];
                    puntos[i] = puntos[i + 1];
                    puntos[i + 1] = mayor;

                    equipoMayor = equipos[i];
                    equipos[i] = equipos[i + 1];
                    equipos[i + 1] = equipoMayor;

                    continua = true;
                }
            }
            aux--;

        } while (continua);
        
        BufferedWriter archivo = null;
        try {
//        String pathWrite = "C:\\Users\\thiri\\Documents\\compartir\\clasificacio.txt";
        File archivotexto = new File("C:\\Users\\thiri\\Documents\\compartir\\clasificacio.txt");

        if (!archivotexto.exists()) {
            archivotexto.createNewFile();
        }

        FileWriter output = new FileWriter(archivotexto);
        archivo = new BufferedWriter(output);
        String linea;

        for (int i = equipos.length - 1; i >= 0; i--) {

            linea = equipos[i] + " tiene " + puntos[i] + " puntos.";

            System.out.println(linea);

            archivo.write(linea);
            archivo.newLine();
        }
        } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(archivo!=null)
		 archivo.close();
	   }catch(IOException ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
    }
}
