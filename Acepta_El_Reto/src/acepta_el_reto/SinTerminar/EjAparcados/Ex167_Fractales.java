package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex167_Fractales {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int longitudFractalMasGrande = in.nextInt(), sumatorio = 0, vueltaFractal = 0;

            do {

                if (vueltaFractal == 0) {
                    sumatorio += (longitudFractalMasGrande * 4);
                    // Primera vuelta, se multiplica el lado de un fractal por 4 lados (es un cuadrado)
                } else {
                    sumatorio += (longitudFractalMasGrande * 4) * (Math.pow(4, vueltaFractal));
                    // Siguientes vueltas, se hace la misma multiplicación y a posteriori se eleva 
                    //4 cuadraditos que contiene cada fractal, empieza elevado a 1 y segun va subiendo el contador se va elevando a mas.
                }
                vueltaFractal++;

                longitudFractalMasGrande /= 2;

            } while (longitudFractalMasGrande != 0);
            System.out.println(sumatorio);
        }
        in.close();
    }
}
