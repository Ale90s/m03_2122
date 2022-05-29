package p1;

import java.io.*;
import java.util.Scanner;
import p1.Armas.*;
import p1.Personatges.*;

public class HeroesOfVannaria {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Personatges[] personajes = new Personatges[3];

        String path = "D:\\thiri\\Documents\\NetBeansProjects\\m03_2122\\UF4_Ejercicios\\src\\p1\\personatges (3).csv";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        int contador = 0;

        while ((linea = archivo.readLine()) != null) {
            System.out.println(linea);
            personajes[contador] = creaPersonaje(linea);
            contador++;
        }
        
        System.out.println("Los personajes se han creado satisfactoriamente");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Qué quieres hacer ahora?");
        System.out.println("1 - jugar (duelo 1v1 entre dos personajes)");
        System.out.println("2 - Guardar partida y salir");
        System.out.println("3 - Salir sin guardar");

        boolean acabar = false;
        
        while (!acabar) {
            switch (in.nextInt()) {
            case 1:
                jugar(personajes);
                break;
            case 2:
                System.out.println("Guardando partida y saliendo...");
                acabar = true;
                break;
            case 3:
                System.out.println("Saliendo sin guardar partida...");
                acabar = true;
                break;
            
            }
        }
    }

    public static void tiradasDados(double[] dados) {

        for (int i = 0; i < dados.length; i++) {

            dados[i] = Math.floor(Math.random() * (25 - 1 + 1) + 1);

        }

    }

    public static Personatges creaPersonaje(String linea) {

        String[] caracteristicas = linea.split(";");
        Personatges personaje = null;
        Armas arma;
        
        switch (caracteristicas[7]) {
            case "Daga":
                arma = new Daga();
                break;
            case "Espasa":
                arma = new Espasa();
                break;
            case "Martell de combat":
                arma = new MartellCombat();
                break;
            default:
                arma = new Puños();
                break;
        }
        
        switch (caracteristicas[1]) {
            case "Assassi":
                personaje = new Assassi(caracteristicas[0], Double.parseDouble(caracteristicas[2]), Double.parseDouble(caracteristicas[3]), 
                        Double.parseDouble(caracteristicas[4]), Double.parseDouble(caracteristicas[5]), Double.parseDouble(caracteristicas[6]), 
                        arma, Integer.parseInt(caracteristicas[8]), Integer.parseInt(caracteristicas[9]));
                break;
            case "Caballer":
                personaje = new Caballer(caracteristicas[0], Double.parseDouble(caracteristicas[2]), Double.parseDouble(caracteristicas[3]), 
                        Double.parseDouble(caracteristicas[4]), Double.parseDouble(caracteristicas[5]), Double.parseDouble(caracteristicas[6]), 
                        arma, Integer.parseInt(caracteristicas[8]), Integer.parseInt(caracteristicas[9]));
                break;
            case "Guerrer":
                personaje = new Guerrer(caracteristicas[0], Double.parseDouble(caracteristicas[2]), Double.parseDouble(caracteristicas[3]), 
                        Double.parseDouble(caracteristicas[4]), Double.parseDouble(caracteristicas[5]), Double.parseDouble(caracteristicas[6]), 
                        arma, Integer.parseInt(caracteristicas[8]), Integer.parseInt(caracteristicas[9]));
                break;
            case "Valkiria":
                personaje = new Valquiria(caracteristicas[0], Double.parseDouble(caracteristicas[2]), Double.parseDouble(caracteristicas[3]), 
                        Double.parseDouble(caracteristicas[4]), Double.parseDouble(caracteristicas[5]), Double.parseDouble(caracteristicas[6]), 
                        arma, Integer.parseInt(caracteristicas[8]), Integer.parseInt(caracteristicas[9]));
                break;
            default:
                System.out.println("Ese tipo de personaje no existe...");
                break;
        }

        return personaje;
    }
    
    public static void jugar(Personatges[] personajes) {
        
        System.out.println("Bienvenido a Herores of Vannaria");
        
        System.out.println("Personajes disponibles:");
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < personajes.length; i++) {
            System.out.println("PERSONAJE " + (i+1));
            personajes[i].getcaracteristicas();
        }
        
        
    }
}
