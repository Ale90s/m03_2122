package uf2_ejercicios.p1.a2;

import java.util.Locale;
import java.util.Scanner;

public class Ex02_TemperaturesOrdenatsMetodeSeleccio {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("US"));
        
        Scanner in = new Scanner(System.in);

        int nArray = in.nextInt();

        double temperatures[] = new double[nArray];

        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = in.nextDouble();
        }

        temperatures = ordenaSeleccio2(temperatures);

        for (int i = 0; i < temperatures.length - 1; i++) {
            System.out.print(temperatures[i] + " ");
        }
        System.out.println("");
        System.out.printf("Total passades: %.0f%n", temperatures[temperatures.length - 1]);
    }

    public static double[] ordenaSeleccio2(double[] array) {

        double arrayConPasadas[] = new double[array.length + 1];

        double mayor;
        int pasadas = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                pasadas++;
                if (array[i] > array[j]) {
                    mayor = array[i];
                    array[i] = array[j];
                    array[j] = mayor;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            arrayConPasadas[i] = array[i];
        }

        arrayConPasadas[arrayConPasadas.length - 1] = pasadas;

        return arrayConPasadas;
    }
}
