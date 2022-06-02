package p1;

import java.io.*;
import java.util.*;
import p1.Personatges.*;
import p1.Armas.*;

public class HeroesOfVannaria {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Personatges> personajes = new ArrayList<>();

        String path = "C:\\Users\\aalgarra\\Documents\\Informatica\\m03_2122\\UF4_Ejercicios\\src\\p1\\personatges (3).csv";

        FileReader input = new FileReader(path);
        BufferedReader archivo = new BufferedReader(input);
        String linea;

        while ((linea = archivo.readLine()) != null) {
            personajes.add(creaPersonajeAuto(linea));
        }

        System.out.println("Los personajes se han creado satisfactoriamente");

        Scanner in = new Scanner(System.in);

        boolean acabar = false;

        while (!acabar) {

            System.out.println("Qué quieres hacer ahora?");
            System.out.println("1 - jugar (duelo 1v1 entre dos personajes)");
            System.out.println("2 - Crear personaje manualmente");
            System.out.println("3 - Modificar Personaje (Nombre y atributos)");
            System.out.println("4 - Guardar partida y salir");
            System.out.println("5 - Salir sin guardar");

            switch (in.nextInt()) {
                case 1:
                    jugar(personajes);
                    break;
                case 2:
                    personajes.add(creaPersonajeManual());
                    break;
                case 3:
                    modificarPersonaje(personajes);
                    break;
                case 4:
                    System.out.println("Guardando partida y saliendo...");
                    guardarPartida(personajes);
                    acabar = true;
                    break;
                case 5:
                    System.out.println("Saliendo sin guardar partida...");
                    acabar = true;
                    break;

            }
        }
    }

    public static void jugar(ArrayList<Personatges> personajes) {

        System.out.println("Bienvenido a Herores of Vannaria");

        if (personajes.size() < 2) {
            System.out.println("No hay suficientes personajes, prueba creando un"
                    + " personaje manualmente");
        } else {
            System.out.println("Personajes disponibles:");
            System.out.println("");
            System.out.println("");

            for (int i = 0; i < personajes.size(); i++) {
                System.out.println("-------- " + (i + 1) + " --------");
                personajes.get(i).getcaracteristicas();
            }

            System.out.println("Elige dos personajes: [1-" + personajes.size() + "]");

            Scanner in = new Scanner(System.in);
            int personajeA = 0, personajeB = 0, n;
            boolean elegidos = false;

            while (!elegidos) {

                n = in.nextInt();

                if (n >= 1 && n <= personajes.size()) {
                    if (personajeA == 0) {
                        System.out.println("Primer personaje elegido. Escoge otro");
                        personajeA = n;
                    } else {
                        if (n != personajeA) {
                            personajeB = n;

                            elegidos = true;

                            personajeA--;
                            personajeB--;
                        } else {
                            System.out.println("Ese personaje ya lo has elegido...");
                        }
                    }
                } else {
                    System.out.println("Un número entre [1-" + personajes.size() + "]");
                }
            }

            System.out.println("");
            System.out.println("");
            System.out.println("Personajes elegidos: ");
            System.out.println("");
            personajes.get(personajeA).getcaracteristicas();
            personajes.get(personajeB).getcaracteristicas();

            System.out.print("Empieza el combate!! Pulsa intro para continuar...");
            System.out.println("");
            in.nextLine();
            in.nextLine();
            boolean atacaA = true;

            while (personajes.get(personajeA).getPs() > 0 && personajes.get(personajeB).getPs() > 0) {
                if (atacaA) { // primero ataca personajeA y después personajeB por orden

                    pelea(personajes, personajeA, personajeB);

                    atacaA = false;
                } else {

                    pelea(personajes, personajeB, personajeA);

                    atacaA = true;
                }
                System.out.println("");
            }
            if (personajes.get(personajeA).getPs() <= 0) {
                System.out.println(personajes.get(personajeB).getNom() + " ha ganado el combate!!");
                System.out.println("Ha ganado 100 puntos de experiencia!");
                System.out.println("");
                personajes.get(personajeB).setPex(personajes.get(personajeB).getPex() + 100);
            } else {
                System.out.println(personajes.get(personajeA).getNom() + " ha ganado el combate!!");
                System.out.println("Ha ganado 100 puntos de experiencia!");
                System.out.println("");
                personajes.get(personajeA).setPex(personajes.get(personajeA).getPex() + 100);
            }
        }
    }

    public static void pelea(ArrayList<Personatges> personajes, int x, int y) {

        Scanner in = new Scanner(System.in);
        int[] dados = new int[3];

        System.out.println("Turno de " + personajes.get(x).getNom()
                + "[PS: " + personajes.get(x).getPs() + "]. Tira los dados para comprobar si acierta el ataque [intro]");
        in.nextLine();
        tiradasDados(dados);
        if (dados[0] + dados[1] + dados[2] <= personajes.get(x).getPa()) {
            System.out.print("Ha acertado el ataque! El enemigo se va a defender [intro]");
            System.out.println("");
            in.nextLine();
            tiradasDados(dados);
            if (dados[0] + dados[1] + dados[2] <= personajes.get(y).getPe()) {
                System.out.println("El enemigo ha esquivado el ataque!");

                if (personajes.get(y).contraAtaca()) { // Asesino contraataca
                    personajes.get(x).setPs(personajes.get(x).getPs()
                            - personajes.get(y).getPd());
                    System.out.println("");
                    System.out.println(personajes.get(y).getNom() + " ha conseguido contraatacar!");
                    System.out.println("");
                    System.out.println("Le ha bajado " + personajes.get(y).getPd()
                            + " puntos de vida. (Le quedan " + personajes.get(x).getPs() + ")");
                }

            } else {
                System.out.println("Ha conseguido acertar el ataque!");
                System.out.println("");
                personajes.get(y).setPs(personajes.get(y).getPs()
                        - personajes.get(x).getPd());
                System.out.println("Le ha bajado " + personajes.get(x).getPd()
                        + " puntos de vida. (Le quedan " + personajes.get(y).getPs() + ")");
                personajes.get(x).recuperaParcialmentPS(); // Caballero recupera vida
            }
        } else {
            System.out.println("Oh no!!! Ha fallado el ataque!");
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
                personaje = new Cavaller(caracteristicas[0], Double.parseDouble(caracteristicas[2]), Double.parseDouble(caracteristicas[3]),
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
        int tipo, fuerza, constitucion, velocidad, inteligencia, suerte, puntos = 60, x = 0, arma, cantidad = 4;
        System.out.println("Nombre del personaje: ");
        nombre = in.nextLine();
        System.out.println("Elige la clase:");
        do {
            System.out.println("1. Guerrero\n2. Asesino\n3. Caballero\n4.Valquiria");
            tipo = in.nextInt();
        } while (tipo > 4 || tipo < 1);

        System.out.print("Fuerza: ");
        fuerza = generarPuntos(x, puntos, cantidad);
        puntos -= fuerza;
        cantidad--;

        System.out.print("Constitucion: ");
        constitucion = generarPuntos(x, puntos, cantidad);
        puntos -= constitucion;
        cantidad--;
        System.out.print("Velocidad: ");
        velocidad = generarPuntos(x, puntos, cantidad);
        puntos -= velocidad;
        cantidad--;
        System.out.print("Inteligencia: ");
        inteligencia = generarPuntos(x, puntos, cantidad);
        puntos -= inteligencia;
        cantidad--;
        System.out.print("Suerte: ");
        suerte = generarPuntos(x, puntos, cantidad);
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
                persona = new Cavaller(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
            case 4:
                persona = new Valquiria(nombre, fuerza, constitucion, velocidad, inteligencia, suerte, herramienta, 0, 0);
                break;
        }

        return persona;

    }

    public static int generarPuntos(int x, int puntos, int cantidad) {
        Scanner in = new Scanner(System.in);
        boolean pnt = false;
        int puntosReal = 0;
        if (puntos <= 18) {
            puntosReal = puntos;
            puntos = puntos - (3 * cantidad);

            pnt = true;
        }

        if (!pnt) {
            do {
                System.out.println("[3 - 18] \nTienes: " + puntos + " puntos");
                x = in.nextInt();

            } while (x < 3 || x > 18 && puntos != 0);

        } else {
            do {
                System.out.println("[3 - " + puntos + "]\nTienes: " + puntosReal + " puntos");
                x = in.nextInt();
            } while (x < 3 || x > puntos);
        }

        return x;
    }

    public static void modificarPersonaje(ArrayList<Personatges> persona) {
        Scanner in = new Scanner(System.in);
        boolean salir = false;
        char opciones;
        int personaje;

        System.out.println("\nQue personaje quieres modificar?");

        for (int i = 0; i < persona.size(); i++) {
            System.out.println((i + 1) + ". " + persona.get(i).getNom());
        }

        do {
            personaje = in.nextInt();
            if (personaje > persona.size() || personaje < 1) {
                System.out.println("Pon un número válido");
            }
        } while (persona.size() < personaje || personaje < 1);

        persona.get(personaje - 1).getcaracteristicas();

        do {

            System.out.println("\n1.Cambiar nombre\n2.Cambiar caracteristicas\n"
                    + "3.Muestra los datos cambiados\nx.Salir");
            opciones = in.next().charAt(0);
            in.nextLine();
            switch (opciones) {
                case '1':
                    System.out.print("Que nombre quieres poner? ");
                    String nombre = in.nextLine();
                    persona.get(personaje - 1).setNom(nombre);
                    break;
                case '2':
                    int puntos = 60,
                     x = 0,
                     cantidad = 4;

                    System.out.print("Fuerza: ");
                    persona.get(personaje - 1).setForca(generarPuntos(x, puntos, cantidad));
                    puntos -= persona.get(personaje - 1).getForca();
                    cantidad--;
                    System.out.print("Constitucion: ");
                    persona.get(personaje - 1).setConstitucio(generarPuntos(x, puntos, cantidad));
                    puntos -= persona.get(personaje - 1).getConstitucio();
                    cantidad--;
                    System.out.print("Velocidad: ");
                    persona.get(personaje - 1).setVelocitat(generarPuntos(x, puntos, cantidad));
                    puntos -= persona.get(personaje - 1).getVelocitat();
                    cantidad--;
                    System.out.print("Inteligencia: ");
                    persona.get(personaje - 1).setInteligencia(generarPuntos(x, puntos, cantidad));
                    puntos -= persona.get(personaje - 1).getInteligencia();
                    cantidad--;
                    System.out.print("Suerte: ");
                    persona.get(personaje - 1).setSort(generarPuntos(x, puntos, cantidad));
                    puntos -= persona.get(personaje - 1).getSort();

                    break;
                case '3':
                    persona.get(personaje - 1).getcaracteristicas();
                    break;
                case 'x':
                    salir = true;
                    break;
            }

        } while (!salir);

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
