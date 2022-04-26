package a1;

import java.io.*;

public class Ejercicios {

    public static void main(String[] args) {

        String path = "C:\\Users\\thiri\\Documents\\compartir";
        String path2 = "C:\\Users\\thiri\\Documents\\compartir\\prueba.txt";

        File f = new File(path);
        File f2 = new File(path2);

        /* Ejercicio 1. Lista ficheros de una carpeta */
        String test[] = f.list();

        for (int i = 0; i < test.length - 1; i++) {
            System.out.print(test[i] + ", ");
        }
        System.out.println(test[test.length - 1] + ".");

        /* Ejercicio 2. Chequear si existe un fichero */
        boolean existe = f2.exists();

        if (existe) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }

        /* Ejercicio 3. Chequear si tiene permisos de lectura y escritura */
        boolean puedeLeer = f2.canRead();
        boolean puedeEscribir = f2.canWrite();

        if (puedeLeer && puedeEscribir) {
            System.out.println("Tienes todos los permisos");
        } else {
            System.out.println("Falta algún permiso");
        }

        /* Ejercicio 4. Chequear si es un fichero o un directorio*/
        boolean esFichero = f.isFile();

        if (esFichero) {
            System.out.println("Es un fichero.");
        } else {
            System.out.println("Es una carpeta");
        }

        esFichero = f2.isFile();

        if (esFichero) {
            System.out.println("Es un fichero.");
        } else {
            System.out.println("Es una carpeta");
        }

        /* Ejercicio 5. Medida de fichero o directorio */
        long espacioEnBytes = f.getTotalSpace();
        long espacioEnKB = espacioEnBytes / 1000;
        long espacioEnMB = espacioEnKB / 1000;

        System.out.println("El espacio que ocupa en bytes es: "
                + espacioEnBytes);
        System.out.println("El espacio que ocupa en KiloBytes es: "
                + espacioEnKB);
        System.out.println("El espacio que ocupa en MegaBytes es: "
                + espacioEnMB);

        /* Ejercicio 6. Crea o borra carpeta */
        String path3 = "C:\\Users\\thiri\\Documents\\compartir\\carpetaPrueba";

        File f3 = new File(path3);

        if (f3.exists()) {
            f3.delete();
            System.out.println("La carpeta ha sido borrada");
        } else {
            f3.mkdir();
            System.out.println("La carpeta ha sido creada");
        }

//        try {
//            if (f2.createNewFile()) {
//                System.out.println("El archivo ha sido creado");
//            } else {
//                f2.delete();
//                System.out.println("El archivo ha sido borrado");
//            }
//        } catch (IOException e) {
//            System.out.println("Algo ha fallado inesperadamente");
//        }

        /* Ejercicio 7. Lista ficheros de una carpeta que superan una cierta medida */
        File a[] = f.listFiles();
        long medida = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i].getTotalSpace() > medida) {
                System.out.println("El fichero " + a[i] + " sobrepasa la medida.");
            } else {
                System.out.println("El fichero " + a[i] + " no sobrepasa la medida.");
            }
        }
    }
}
