package uf2_ejercicios.a1;

import java.util.Scanner;
import java.util.Random;

public class pruebass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random rnd = new Random();
        String[] palabras = {"patata", "panini", "atun", "pez", "tablet", "tomate", "servilleta", "jamon dulce", "jamon serrano", "chocolate", "dormitorio", "pinza", "pinga", "formacion y orientacion laboral"};
        int random = rnd.nextInt(palabras.length); //copiado de internet para simplificar

        boolean juegoGanado = false;
        int count = 0, aciertos = 0, espacios = 0;
        String letras = "";
        char resp;
        char[] adivinada = adivina(palabras[random]); // String -> char[]
        char[] letrasOcultas = new char[adivinada.length];

        for (int i = 0; i < letrasOcultas.length; i++) {
            if (adivinada[i] == ' ') { // si hay espacios, se suma 1 a la variable espacios (para comprobar la victoria).
                letrasOcultas[i] = ' ';
                espacios++;
            } else {
                letrasOcultas[i] = '_';
            }
        }

        System.out.println(dibujarDibujo(0));
        do {
            imprimeOculta(letrasOcultas);
            System.out.print("FALLO(S): " + count + "/9\n");
            System.out.print("Introduce letra: ");
            resp = in.next().toLowerCase().charAt(0);

            do {
                if (letras.contains(Character.toString(resp))) {
                    System.out.println("Lletra repetida");
                } else {
                    if (palabras[random].contains(String.valueOf(resp))) { 
                                        // SOLO CHEQUEAMOS ESE CARACTER SIN NECESIDAD DE HACERLO STRING
                        for (int i = 0; i < adivinada.length; i++) {
                            if (adivinada[i] == resp) {
                                letrasOcultas[i] = adivinada[i];
                                // adivinada[i] = ' '; QUITAMOS ESTA LINEA
                                aciertos++;
                            }
                        }
                    } else {
                        count++;
                    }
                    System.out.println(dibujarDibujo(count) + "");
                    letras += resp + " "; 
                    // LO PASAMOS ARRIBA PARA QUE NO REPITA PALABRAS REPETIDAS EN EL REGISTRO
                }
                // letras += resp + " ";
                System.out.println("{  " + letras + " }");
            } while (!(letras.contains(Character.toString(resp))));
            if (aciertos == letrasOcultas.length - espacios) {
                juegoGanado = true;
            }

        } while (!((count >= 9) || juegoGanado == true));

        System.out.println(dibujarDibujo(count));
        System.out.println("{  " + letras + " }");
        if (juegoGanado) {
            System.out.println(palabras[random]);
            System.out.println("Victoria");
            System.out.println("Eres el mejor");
        } else {
            System.out.println("Derrota");
            System.out.printf("La palabra secreta era: '%s'%n", palabras[random]);
        }
    }

    public static char[] adivina(String palabra) {
        char[] letras = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            letras[i] = palabra.charAt(i);
        }
        return letras;
    }

    public static void imprimeOculta(char[] letrasOcultas) {
        for (int i = 0; i < letrasOcultas.length; i++) {
            System.out.print(letrasOcultas[i] + " ");
        }
        System.out.println();
    }

    public static String dibujarDibujo(int contador) {
        String[] dibujo = {"   ____\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |    |\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\\\n"
            + "  |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\\\n"
            + "  |    |\n"
            + "  |\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\\\n"
            + "  |    |\n"
            + "  |   /\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\\\n"
            + "  |    |\n"
            + "  |   / \\\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|", "   ____\n"
            + "  |    |\n"
            + "  |    o\n"
            + "  |   /|\\\n"
            + "  |    |\n"
            + "  |   /|\\\n"
            + " _|_\n"
            + "|   |______\n"
            + "|          |\n"
            + "|__________|"};

        int pasos = 0;
        pasos += contador;
        return dibujo[pasos];
    }
}
