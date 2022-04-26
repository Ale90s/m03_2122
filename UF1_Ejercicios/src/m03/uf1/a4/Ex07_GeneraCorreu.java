package m03.uf1.a4;

import java.util.Scanner;

public class Ex07_GeneraCorreu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "iso-8859-1");
        String correo = "", apellidoUno, apellidoDos = null, nombre;

        System.out.print("Introdueix el teu nom: ");
        nombre = in.nextLine();
        System.out.print("Introdueix els teus cognoms: ");
        apellidoUno = in.nextLine();
        for (int i = 0; i < apellidoUno.length(); i++) {
            if (apellidoUno.charAt(i) == ' ') {
                if (apellidoUno.charAt(i + 1) != ' ') {
                    apellidoDos = apellidoUno.substring(i + 1, apellidoUno.length());
                    apellidoUno = apellidoUno.substring(0, i);
                }
            }
        }
        apellidoUno = apellidoUno.toLowerCase();
        apellidoDos = apellidoDos.toLowerCase();
        nombre = nombre.toLowerCase();

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

        System.out.println("La teva adreça de correu és:");

        System.out.println(correo = apellidoUno + "." + apellidoDos + "."
                + nombre + "@alumnat.copernic.cat");
    }
}
