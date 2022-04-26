package m03.uf1.a5;

public class Ex10_MatriuAleatori {

    public static final int MAX = 99;
    public static final int MIN = 10;

    public static void main(String[] args) {

        int numeros[] = new int[100];
        
        System.out.println("        0   1   2   3   4   5   6   7   8   9");
        System.out.println("----------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "  |   ");
            for (int j = 0; j < 10; j++) {
                numeros[j] = MIN + (int) (Math.random() * (MAX - MIN + 1));
                System.out.print(numeros[j] + "  ");
            }
            System.out.println("");
        }
    }
}
