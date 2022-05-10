package acepta_el_reto.SinTerminar.EjAparcados;

import java.util.Scanner;

public class Ex455_ParticipantesEnUnaEstadistica {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n = in.nextDouble();

        for (int i = 0; i < n; i++) {
            double estadistica = in.nextDouble() / 100;

            if (estadistica < 1) {
                System.out.printf("10000%n");
            } else if (estadistica <= 50) {
                System.out.printf("%.0f%n", 100 / estadistica);
            } else {
                System.out.printf("%.0f%n", 100 / (100 - estadistica));
            }
        }
        in.close();
    }
}
