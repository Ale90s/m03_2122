package a1;

import java.io.*;
import java.util.*;

public class zEjercicioJuan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String nom, telefon;
        
        try{
            FileWriter flux = new FileWriter("Agenda.txt");
            BufferedWriter fitxer = new BufferedWriter(flux);
            do {
                System.out.println("Insereix un nom (INTRO per finalitzar)");
                nom = in.nextLine();
                if (nom.length() > 0) {
                    System.out.println("Telèfon: ");
                    telefon = in.nextLine();
                    fitxer.write(nom + ", " + telefon);
                    fitxer.newLine();
                }
            } while(nom.length() != 0);
            fitxer.close();
        } catch(IOException e){System.out.println("Error al fitxer");};
        
        
    }

}
