/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1Pol;

import p1Pol.Personajes.Personatge;
import p1Pol.Personajes.Valkiria;
import p1Pol.Personajes.Assassi;
import p1Pol.Personajes.Cavaller;
import p1Pol.Personajes.Guerrer;
import p1Pol.Armas.Arma;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rferrero
 */
public class HeroesOfVannaria {

    static Scanner sc = new Scanner(System.in);
    
    private ArrayList<Personatge> personatges;
    private Arma[] armes;
    
    public HeroesOfVannaria() {
        
        armes = new Arma[3];
        armes[0] = new Arma("Daga",5,15);
        armes[1] = new Arma("Espasa",10,10);
        armes[2] = new Arma("Martell de combat",15,5);
        
        personatges = llegirFitxer("personatges.csv");
        
    }
    
    
    public static void main(String[] args) {
        
        /*
        //Arma a1 = new Arma("Espasa",10,10);
        Cavaller cavaller = new Cavaller(3,7,10,18,15,new Arma("Espasa",10,10));
        //cavaller.setArma(a1);
        */
        
        HeroesOfVannaria joc = new HeroesOfVannaria();        
        joc.jugar();
    }
    
    
    
    public void jugar() {
    
        boolean finalJoc = false;
        while(!finalJoc) {
            
            // Mostrar el menú
            System.out.println("\n\n*** HEROES OF VANNARIA ***\n");
            System.out.println("1.- Crear personatge");
            System.out.println("2.- Iniciar combat");
            System.out.println("X.- Sortir");

            System.out.print("\nTria una opció: ");
            String opcio = sc.nextLine();

            //Seleccionar opció i cridar al mètode corresponent
            switch (opcio) {
                case "1":
                    crearPersonatge();
                    break;
                case "2":
                    combat();
                    break;
                case "X":
                case "x":
                    finalJoc = true;
                    break;
                default:
                    System.out.println("Opció incorrecta!");
            }

        }
    }
    
    private void crearPersonatge() {
        System.out.print("Introdueix el nom d'un personatge: ");
        String nom = sc.nextLine();
        System.out.print("Introdueix la classe del personatge: ");
        String classe = sc.nextLine();
        
        System.out.print("Introdueix l'arma del personatge: ");
        String arma = sc.nextLine();

        // Creem el personatge amb la seva corresponent arma
        //...
        
        //personatges.add(personatge);
    }
    
    
    /**
     * Inicia un combat entre 2 personatges
     */
    private void combat() {
        
        // Demanar personatges
        
        // Fer combat
    }
    
    
    private int tirada() {
        
        Dau dau1 = new Dau(25);
        Dau dau2 = new Dau(25);
        Dau dau3 = new Dau(25);
        
        int valor = dau1.tirada() + dau2.tirada() + dau3.tirada();
        System.out.println("Valor tirada: " + valor);        
        
                        
        return 0;
    }
    
    
    private ArrayList<Personatge> llegirFitxer(String nomFitxer) {
        
        ArrayList<Personatge> personatges = new ArrayList<Personatge>();
        try {
            BufferedReader entrada = new BufferedReader(
                                new FileReader(nomFitxer));

            int i = 0;
            String personatgeStr;
            while((personatgeStr = entrada.readLine()) != null) {
                String[] caracteristiques = personatgeStr.split(";");
                String classe = caracteristiques[1];

                Arma laMevaArma = null;
                if (caracteristiques[7].equals("Daga")) // Nom arma
                    laMevaArma = armes[0];
                else if(caracteristiques[7].equals("Espasa"))
                    laMevaArma = armes[1];                        
                else if(caracteristiques[7].equals("Martell de combat")) 
                    laMevaArma = armes[2];
                
                String nom        = caracteristiques[0];
                int forca         = Integer.parseInt(caracteristiques[2]);
                int constitucio   = Integer.parseInt(caracteristiques[3]);
                int velocitat     = Integer.parseInt(caracteristiques[4]);
                int intelligencia = Integer.parseInt(caracteristiques[5]);
                int sort          = Integer.parseInt(caracteristiques[6]);

                Personatge personatge = null;
                switch (classe) {
                    case "Guerrer":
                        personatge = new Guerrer(nom,forca,constitucio,velocitat,
                                                 intelligencia,sort,laMevaArma);
                        break;
                    case "Cavaller":
                        personatge = new Cavaller(nom,forca,constitucio,velocitat,
                                                  intelligencia,sort,laMevaArma);
                        break;
                    case "Valkiria":
                        personatge = new Valkiria(nom,forca,constitucio,velocitat,
                                                  intelligencia,sort,laMevaArma);                        
                        break;
                    case "Assassí":
                        personatge = new Assassi(nom,forca,constitucio,velocitat,
                                                 intelligencia,sort,laMevaArma);                        
                        break;
                }
                
                personatges.add(personatge);
            }
            entrada.close();



        } catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
            System.out.println("Error fitxer no trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }
        
        return personatges;
        
    }
}
