package uf2_ejercicios.a1;

import java.util.Scanner;

public class Ex11_Penjat {

    public static void main(String[] args) {

        palabra();
    }

    public static void printFallos(int nFallos) {
        
        switch (nFallos) {

            case 0:
                System.out.println("   ____");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 1:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 2:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |  ");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 3:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |    |");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 4:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |   /|");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 5:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |   /|\\");
                System.out.println("  |  ");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 6:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |   /|\\");
                System.out.println("  |    |");
                System.out.println(" _|_  ");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 7:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |   /|\\");
                System.out.println("  |    |");
                System.out.println(" _|_  /");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            case 8:
                System.out.println("   ____");
                System.out.println("  |    |");
                System.out.println("  |    o");
                System.out.println("  |   /|\\");
                System.out.println("  |    |");
                System.out.println(" _|_  / \\");
                System.out.println("|   |______");
                System.out.println("|          |");
                System.out.println("|__________|");
                break;
            default:
                System.out.println("Error.");
                break;
        }
    }
    
    public static String datos(String palabra, String letras) {
        Scanner in = new Scanner(System.in);
        System.out.println("Paraula: " + palabra);
        System.out.println("Lletres: " + letras);
        System.out.print("Introdueix lletra: ");
        return in.nextLine().toLowerCase();
    }
    
    public static void palabra() {
        
        boolean won = false, letraRepetida = false, letraCorrecta = false;
        int nFallos  = 0;
        String pOriginal = palabraAleatoria().toLowerCase(), letras = "".toLowerCase(),
                intentoLetra;
        String p = pOriginal;
        for (int i = 0; i < pOriginal.length(); i++) {
            p = p.replace(p.charAt(i), '*');
        } // CONVERTIMOS LA PALABRA ORIGINAL EN ASTERISCOS PARA P

        do {
            printFallos(nFallos);
            intentoLetra = datos(p, letras);
            
            for (int i = 0; i < letras.length(); i++) {
                if (intentoLetra.charAt(0) == letras.charAt(i)) {
                    letraRepetida = true;
                }// COMPRUEBA SI NO ES UNA LETRA REPETIDA
            }
            
            if (!letraRepetida) {
                letras += intentoLetra.charAt(0);
                for (int i = 0; i < pOriginal.length(); i++) {
                    if(pOriginal.charAt(i) == intentoLetra.charAt(0)) {
                        
                        char[] pChars = p.toCharArray();
                        pChars[i] = intentoLetra.charAt(0);
                        p = String.valueOf(pChars);
                        // CONVIERTE STRING A ARRAY DE CHAR PARA INTRODUCIR LA LETRA
                        // Y DESPUES VUELVE A CONVERTIRLO A STRING
                        
                        letraCorrecta = true;
                    }
                }// EN CASO DE QUE LA LETRA NO ESTÉ REPETIDA QUE PRUEBE SI ES CORRECTA
                if (!letraCorrecta){
                nFallos++;
                }
                letraCorrecta = false;
            } else {
                letraRepetida = false;
            }
            
            
            
            if (p.equals(pOriginal) || nFallos == 8) {
                won = true;
            }// SI TIENES 8 FALLOS O PALABRA ADIVINADA QUE ACABE BUCLE
        } while (!won);
        
        if (nFallos < 8) {
            System.out.println("Felicitats!!! Has guanyat!!");
        } else {
            System.out.println("OOOOOoooohhhh! Has perdut!!");
            System.out.println("La paraula secreta era: " + pOriginal);
        }
    }
    
    public static String palabraAleatoria() {
        
        String [] palabras = {"patata", "pera", "cacahuete", "gofre", "bicicleta"};
        
        return palabras[(int)(Math.random()*((palabras.length - 1) - 0 + 1) + 0)];
    }
}

    