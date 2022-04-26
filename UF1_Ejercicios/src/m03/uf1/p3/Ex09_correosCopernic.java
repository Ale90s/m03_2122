package m03.uf1.p3;

import java.util.Scanner;

public class Ex09_correosCopernic {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nombre = in.nextLine(), apellidoUno = in.next(), apellidoDos = in.next();

        nombre = nombre.toLowerCase();
        apellidoUno = apellidoUno.toLowerCase();
        apellidoDos = apellidoDos.toLowerCase();

        apellidoUno = apellidoUno.replace('ç', 'c');
        apellidoUno = apellidoUno.replace('ñ', 'n');

        apellidoDos = apellidoDos.replace('ç', 'c');
        apellidoDos = apellidoDos.replace('ñ', 'n');

        nombre = nombre.replace('ç', 'c');
        nombre = nombre.replace('ñ', 'n');

        if (nombre.contains("á")) {
            nombre = nombre.replace('á', 'a');
        }
        if (nombre.contains("é")) {
            nombre = nombre.replace('é', 'e');
        }
        if (nombre.contains("í")) {
            nombre = nombre.replace('í', 'i');
        }
        if (nombre.contains("ó")) {
            nombre = nombre.replace('ó', 'o');
        }
        if (nombre.contains("ú")) {
            nombre = nombre.replace('ú', 'u');
        }

        if (apellidoUno.contains("á")) {
            apellidoUno = apellidoUno.replace('á', 'a');
        }
        if (apellidoUno.contains("é")) {
            apellidoUno = apellidoUno.replace('é', 'e');
        }
        if (apellidoUno.contains("í")) {
            apellidoUno = apellidoUno.replace('í', 'i');
        }
        if (apellidoUno.contains("ó")) {
            apellidoUno = apellidoUno.replace('ó', 'o');
        }
        if (apellidoUno.contains("ú")) {
            apellidoUno = apellidoUno.replace('ú', 'u');
        }

        if (apellidoDos.contains("á")) {
            apellidoDos = apellidoDos.replace('á', 'a');
        }
        if (apellidoDos.contains("é")) {
            apellidoDos = apellidoDos.replace('é', 'e');
        }
        if (apellidoDos.contains("í")) {
            apellidoDos = apellidoDos.replace('í', 'i');
        }
        if (apellidoDos.contains("ó")) {
            apellidoDos = apellidoDos.replace('ó', 'o');
        }
        if (apellidoDos.contains("ú")) {
            apellidoDos = apellidoDos.replace('ú', 'u');
        }

        nombre = nombre.substring(0, 1);
        apellidoUno = apellidoUno.substring(0, 3);
        apellidoDos = apellidoDos.substring(0, 3);
        
        
        System.out.println("La seva adreça de correu és:");
        System.out.println(nombre + apellidoUno + apellidoDos + "@alumnat.copernic.cat");
    }
}
