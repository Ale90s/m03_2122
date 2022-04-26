package m03.uf1.p3;

import static java.lang.Character.isLetter;
import java.util.Scanner;

public class Ex08_letrasOrdenAlfabetico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String frase = in.nextLine(), fraseLimpia = "", fraseOrdenada = "";
        int menorCaracter = 125;
        char caracterMenor = 125;

        //LIMPIAMOS LA FRASE
        for (int i = 0; i < frase.length(); i++) {
            if (isLetter(frase.charAt(i))) {
                fraseLimpia += frase.charAt(i);
            }
        }

        //SE REPITE MIENTRAS NO TENGA EL MISMO NUMERO DE CARACTERES LOS DOS STRINGS
        while (fraseLimpia.length() != fraseOrdenada.length()) {

            //DETECTA EL CARACTER MAS PEQUEÑO (PARA TENERLO EN ORDEN ALFABETICO)
            for (int i = 0; i < fraseLimpia.length(); i++) {
                if (fraseLimpia.charAt(i) < menorCaracter) {
                    menorCaracter = fraseLimpia.charAt(i);
                    caracterMenor = (char) menorCaracter;
                }
            }
            //DETECTA CUANTAS VECES SE REPITE ESE CARACTER
            for (int i = 0; i < fraseLimpia.length(); i++) {
                if (caracterMenor == fraseLimpia.charAt(i)) {
                    fraseOrdenada += caracterMenor;
                }
            }

            /*
            ** REEMPLAZA EL CARACTER QUE YA SE HA COPIADO POR '}', QUE ES EL NUMERO
            ** SETEADO POSTERIORMENTE (125), POR LO QUE NO SE DETECTARA AL COGER
            ** EL CARACTER MAS PEQUEÑO
            */
            fraseLimpia = fraseLimpia.replace(caracterMenor, '}');
            menorCaracter = 125;
        }

        System.out.printf("La cadena amb només lletres ordenades és:%n");
        System.out.printf("\"%s\"%n", fraseOrdenada);
    }
}
