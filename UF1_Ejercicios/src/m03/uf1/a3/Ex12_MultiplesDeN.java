package m03.uf1.a3;

public class Ex12_MultiplesDeN {

    private static final int MAX = 100;
    private static final int N = 5;

    public static void main(String[] args) {

        System.out.println("El múltiples de 5 majors que 1 i"
                + " menors que 100 són:");
        
        for (int i = N; i < MAX; i++) {
            if (i % 5 == 0 && i != 90 && i != 95) {
                System.out.printf("%d, ", i);
            } else if (i % 5 == 0 && i == 90 && i != 95) {
                System.out.printf("%d i ", i);
            } else if (i % 5 == 0 && i != 90 && i == 95) {
                System.out.printf("%d.%n", i);
            }
        }
    }
}
