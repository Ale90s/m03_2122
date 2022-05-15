package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex174_Año2013 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int añoInicial, contador = 0, unidades = 0, decenas = 0, centenas = 0,
                miles = 0, decenasMiles = 0, cientosMiles = 0;
        boolean añosPasados = true, añosFuturos = true,
                cuatroDigitos = false, cincoDigitos = false, seisDigitos = false;

        añoInicial = in.nextInt();

        do {

            //FRAGMENTAMOS EL NÚMERO
        if (añoInicial >= 1000 && añoInicial < 10_000) {
            // FRAGMENTACION 4 DIGITOS
            miles = añoInicial / 1000;
            centenas = (añoInicial / 100) - (miles * 10);
            decenas = (añoInicial / 10) - (miles * 100) - (centenas * 10);
            unidades = añoInicial - (miles * 1000) - (centenas * 100) - (decenas * 10);
            cuatroDigitos = true;

        } else if (añoInicial >= 10_000 && añoInicial < 100_000) {
            // FRAGMENTACION 5 DIGITOS
            decenasMiles = añoInicial / 10_000;
            miles = añoInicial / 1000 - (decenasMiles * 10);
            centenas = (añoInicial / 100) - (decenasMiles * 100) - (miles * 10);
            decenas = (añoInicial / 10) - (decenasMiles * 1000) - (miles * 100) - (centenas * 10);
            unidades = añoInicial - (decenasMiles * 10000) - (miles * 1000) - (centenas * 100) - (decenas * 10);
            cincoDigitos = true;

        } else if (añoInicial >= 100_000 && añoInicial < 1_000_000) {
            // FRAGMENTACION 6 DIGITOS
            cientosMiles = añoInicial / 100_000;
            decenasMiles = (añoInicial / 10_000) - (cientosMiles * 10);
            miles = (añoInicial / 1000) - (cientosMiles * 100) - (decenasMiles * 10);
            centenas = (añoInicial / 100) - (cientosMiles * 1000) - (decenasMiles * 100) - (miles * 10);
            decenas = (añoInicial / 10) - (cientosMiles * 10_000) - (decenasMiles * 1000) - (miles * 100) - (centenas * 10);
            unidades = añoInicial - (cientosMiles * 100_000) - (decenasMiles * 10000) - (miles * 1000) - (centenas * 100) - (decenas * 10);
            seisDigitos = true;

        } else {
            // EN EL CASO DE QUE NO SEA UN NUMERO VALIDO SALIMOS DEL BUCLE
            añosPasados = false;
            añosFuturos = false;
        }
            
            if (cuatroDigitos == true) {
                
                if (miles == centenas || miles == decenas || miles == unidades || centenas == decenas || decenas == unidades || centenas == unidades) {
                    //Si alguno de los 4 digitos es igual:
                    contador++;
                    añoInicial++;
                } else {
                    añosFuturos = false;
                    añosPasados = false;
                }
                
            } else if (cincoDigitos == true) {

            } else if (seisDigitos == true) {

            }

        } while (añosPasados == true || añosFuturos == true);
        System.out.println(contador);
        in.close();
    }
}
