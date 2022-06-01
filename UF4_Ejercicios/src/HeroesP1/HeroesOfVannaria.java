package HeroesP1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import HeroesP1.Armas.*;
import HeroesP1.Personatges.*;


public class HeroesOfVannaria {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Personatges> personajes = new ArrayList<>();

        String path = "C:\\Users\\holai\\Downloads\\personatges (3).csv";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        

        while ((linea = archivo.readLine()) != null) {    
            personajes.add(creaPersonaje(linea));
        }

        System.out.println("Los personajes se han creado satisfactoriamente");

        Scanner in = new Scanner(System.in);


        boolean acabar = false;

        while (!acabar) {
            
            System.out.println("Que quieres hacer ahora?");
            System.out.println("1 - jugar (duelo 1v1 entre dos personajes)");
            System.out.println("2 - Crear personaje manualmente");
            System.out.println("3 - Modificar personaje");
            System.out.println("3 - Guardar partida y salir");
            System.out.println("4 - Salir sin guardar");
           
            switch (in.nextInt()) {
                case 1:
                    jugar(personajes);
                    break;
                case 2:
                    personajes.add(crearPersonaje());
                    break;
                case 3:
                    modificarPersonaje(personajes);
                    break;
                    
                    
                case 4:
                    System.out.println("Guardando partida y saliendo...");
                    acabar = true;
                    break;
                    
                case 5: 
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
                arma = new Punios();
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

    public static void jugar(ArrayList<Personatges> personajes) {

        System.out.println("Bienvenido a Herores of Vannaria");

        System.out.println("Personajes disponibles:");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < personajes.size(); i++) {
            System.out.println("PERSONAJE " + (i + 1));
        }

    }

    public static Personatges crearPersonaje() {
        Scanner in = new Scanner(System.in);
        Personatges persona = null;
        Armas herramienta;
        String nombre;
        int tipo, fuerza, constitucion, velocidad, inteligencia, suerte, puntos = 60, x = 0, arma;
        System.out.println("Nombre del personaje: ");
        nombre = in.nextLine();
        System.out.println("Elige la clase:");
        do {
            System.out.println("1. Guerrero\n2. Asesino\n3. Caballero\n4.Valquiria");
            tipo = in.nextInt();
        } while (tipo > 4 || tipo < 1);

        System.out.print("Fuerza: ");
        fuerza = generarPuntos(x, puntos);
        puntos -= fuerza;

        System.out.print("Constitucion: ");
        constitucion = generarPuntos(x, puntos);
        puntos -= constitucion;

        System.out.print("Velocidad: ");
        velocidad = generarPuntos(x, puntos);
        puntos -= velocidad;

        System.out.print("Inteligencia: ");
        inteligencia = generarPuntos(x, puntos);
        puntos -= inteligencia;

        System.out.print("Suerte: ");
        suerte = generarPuntos(x, puntos);
        puntos -= suerte;

        System.out.println("Que arma utilizarás? ");
        System.out.println("1. Daga\n2. Espasa\n3. Martell de Combat");
        arma = in.nextInt();
        switch (arma) {
            case 1:
                herramienta = new Daga();
                break;
            case 2:
                herramienta = new Espasa();
                break;
            case 3:
                herramienta = new MartellCombat();
                break;
            default:
                herramienta = new Punios(); break;
        }

        switch (tipo) {
            case 1:
                persona = new Guerrer(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
            case 2:
                persona = new Assassi(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
            case 3:
                persona = new Caballer(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
            case 4:
                persona = new Valquiria(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
        }

        return persona;

    }

    public static int generarPuntos(int x, int puntos) {
        Scanner in = new Scanner(System.in);
        boolean pnt = false;

        if (puntos <= 18) {
            pnt = true;
        }

        if (!pnt) {
            do {
                System.out.println("Pon un numero entre 3 y 18, \naun te quedan " + puntos + " puntos");
                x = in.nextInt();

            } while (x < 3 || x > 18 && puntos != 0);

        } else {
            do {
                System.out.println("Pon un numero igual o inferior a " + puntos);
                x = in.nextInt();
            } while (x > puntos);
        }

        return x;
    }

    public static void modificarPersonaje(ArrayList<Personatges> persona){
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        char opciones;
        int personaje;
        
        System.out.println("\nQue personaje quieres modificar?");
        
        for (int i = 0; i < persona.size(); i++) {
            System.out.println((i+1)+". "+persona.get(i).getNom());
        }
        
        
        do {
            personaje = in.nextInt();
            if (personaje > persona.size()|| personaje < 1) {
                System.out.println("Pon un número válido");
            }
        } while (persona.size() < personaje || personaje < 1);
        
        
        
        
        persona.get(personaje-1).getcaracteristicas();
        
        do {
            
            System.out.println("\n1.Cambiar nombre\n2.Cambiar caracteristicas\n"
                    + "3.Muestra los datos cambiados\nx.Salir");
            opciones = in.next().charAt(0);
            in.nextLine();
            switch(opciones){
                case '1': 
                    System.out.print("Que nombre quieres poner? ");
                    String nombre = in.nextLine();
                    persona.get(personaje-1).setNom(nombre);
                    break;
                case '2': 
                    int puntos = 60;
                    int x = 0;
                    
                    System.out.print("Fuerza: ");
                    persona.get(personaje-1).setForca(generarPuntos(x, puntos));
                    puntos -= persona.get(personaje-1).getForca();
                    
                    System.out.print("Constitucion: ");
                    persona.get(personaje-1).setConstitucio(generarPuntos(x, puntos));
                    puntos -= persona.get(personaje-1).getConstitucio();
                    
                    System.out.print("Velocidad: ");
                    persona.get(personaje-1).setVelocitat(generarPuntos(x, puntos));
                    puntos -= persona.get(personaje-1).getVelocitat();
                    
                    System.out.print("Inteligencia: ");
                    persona.get(personaje-1).setInteligencia(generarPuntos(x, puntos));
                    puntos -= persona.get(personaje-1).getInteligencia();
                    
                    System.out.print("Suerte: ");
                    persona.get(personaje-1).setSort(generarPuntos(x, puntos));
                    puntos -= persona.get(personaje-1).getSort();
                    
                    
                    
                    
                    
                    break;
                case '3': 
                    persona.get(personaje-1).getcaracteristicas();
                    break;
                case 'x': 
                    salir = true;
                    break;
            }
            
        } while (!salir);
        
    }
    
    
}
