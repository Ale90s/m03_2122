package m03.uf1.p2;

import java.util.Scanner;

public class Ex09_mcm {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int primerNumero, segundoNumero, MCD = 0, mcm, copiaPrimer, copiaSegundo;
        
        // Hacemos copias de las variables primer y segundo ya que luego
        // necesitaremos el valor inicial.
        
        primerNumero = in.nextInt();
        segundoNumero = in.nextInt();
        copiaPrimer = primerNumero; 
        copiaSegundo = segundoNumero;

        do {

            if (primerNumero > segundoNumero && segundoNumero != 0) {
                primerNumero = primerNumero - segundoNumero;
            } else if (primerNumero < segundoNumero && primerNumero != 0) {
                segundoNumero = segundoNumero - primerNumero;
            }
        } while (primerNumero != segundoNumero && primerNumero != 0 && segundoNumero != 0);
        if (primerNumero == 0) {
            MCD = segundoNumero;
        } else if (segundoNumero == 0) {
            MCD = primerNumero;
        } else if (primerNumero == segundoNumero) {
            MCD = primerNumero;
        }

        mcm = (copiaPrimer * copiaSegundo) / MCD;

        System.out.printf("mcm = %d%n", mcm);
    }
}
