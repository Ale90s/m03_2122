package acepta_el_reto.Terminados;

import java.util.Scanner;

public class Ex456_TartaSacher {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            double alto = in.nextDouble(), ancho= in.nextDouble(), nCuadros= in.nextDouble();
            
            double cuadros = alto * ancho;
            
            System.out.printf("%.0f%n",Math.ceil(nCuadros / cuadros));
        }
        in.close();
    }
}
