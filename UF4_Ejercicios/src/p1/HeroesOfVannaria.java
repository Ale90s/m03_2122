package p1;

import java.io.*;
import java.util.*;
import p1.Armas.*;
import p1.Personatges.*;

public class HeroesOfVannaria {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Personatges> personajes = new ArrayList<>();

        String path = "C:\\Users\\aalgarra\\Documents\\Informatica\\m03_2122\\UF4_Ejercicios\\src\\p1\\personatges (3).csv";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        while ((linea = archivo.readLine()) != null) {
            System.out.println(linea);
            personajes.add(creaPersonajeAuto(linea));
        }

        System.out.println("Los personajes se han creado satisfactoriamente");

        Scanner in = new Scanner(System.in);

        boolean acabar = false;

        while (!acabar) {

            System.out.println("Qué quieres hacer ahora?");
            System.out.println("1 - jugar (duelo 1v1 entre dos personajes)");
            System.out.println("2 - Crear personaje manualmente");
            System.out.println("3 - Guardar partida y salir");
            System.out.println("4 - Salir sin guardar");

            switch (in.nextInt()) {
                case 1:
                    jugar(personajes);
                    break;
                case 2:
                    personajes.add(creaPersonajeManual());
                    break;
                case 3:
                    System.out.println("Guardando partida y saliendo...");
                    guardarPartida(personajes);
                    acabar = true;
                    break;
                case 4:
                    System.out.println("Saliendo sin guardar partida...");
                    acabar = true;
                    break;

            }
        }
    }

    public static void jugar(ArrayList<Personatges> personajes) {

        System.out.println("Bienvenido a Herores of Vannaria");

        System.out.println("Personajes disponibles:");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < personajes.size(); i++) {
            System.out.println(personajes.get(i).getNom() + " - " + personajes.get(i).tipoPersonaje());
            personajes.get(i).getcaracteristicas();
        }

    }

    public static void tiradasDados(int[] dados) {

        for (int i = 0; i < dados.length; i++) {
            dados[i] = (int) Math.floor(Math.random() * (25 - 1 + 1) + 1);
        }

    }

    public static Personatges creaPersonajeAuto(String linea) {

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

    public static Personatges creaPersonajeManual() {
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
                herramienta = new Punios();
                break;
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
        System.out.println("El personaje se ha creado satisfactoriamente.");
        System.out.println("");
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

    public static void guardarPartida(ArrayList<Personatges> personajes) {

        try {
            FileWriter flux = new FileWriter("C:\\Users\\aalgarra\\Desktop\\PartidaGuardada.vsc");
            BufferedWriter fitxer = new BufferedWriter(flux);

            for (int i = 0; i < personajes.size(); i++) {

                Personatges personaje = personajes.get(i);

                fitxer.write(personaje.getNom() + ";" + personaje.tipoPersonaje() + ";"
                        + personaje.getForca() + ";" + personaje.getConstitucio() + ";" + personaje.getVelocitat()
                        + ";" + personaje.getInteligencia() + ";" + personaje.getSort() + ";"
                        + personaje.getArmaPersonaje().getNombre() + ";" + personaje.getNiv() + ";" + personaje.getPex());
                fitxer.newLine();

            }

            fitxer.close();
        } catch (IOException e) {
            System.out.println("Error al fitxer");
        }

    }
}
