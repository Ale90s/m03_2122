package m03.uf1.a1;

public class Ex09_AvaluarExpressio {

    public static void main(String[] args) {

        int A = 3, B = 6, C = 4;
        double D = (double) (A + 7 * C) / (B + 2 - A) + 2 * B;

        System.out.println("L'expressió (A+7*C)/(B+2-A)+2*B");
        System.out.println("");
        System.out.println("Pels valors A = " + A + ", B = " + B
                + ", C = " + C);
        System.out.println("És = " + D);

    }

}
