package juego;

import java.io.*;

public class Ej2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path = "C:\\Users\\thiri\\Documents\\compartir\\direccions.txt";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;
        int vertical = 0;
        int horizontal = 0;
        String[] aux;
        String[] aux2;

        while ((linea = archivo.readLine()) != null) {

//            System.out.println(linea);

            aux = linea.split(" ");
            System.out.print(aux[0]);
            System.out.println( " " +aux[1]);
            
            switch (aux[0]) {
                
                case "amunt":
                    vertical += Integer.parseInt(aux[1]);
                    
                    break;
                case "esquerra":
                    horizontal += Integer.parseInt(aux[1]);
                    break;
                case "dreta":
                    horizontal -= Integer.parseInt(aux[1]);
                    break;
                default:
                    break;
                    
            }
            System.out.println(vertical);
            System.out.println(horizontal);
        }
        System.out.println(vertical);
        System.out.println(horizontal);

    }
}
