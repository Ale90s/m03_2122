import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Cuántas iteraciones?");

        int iteraciones = in.nextInt();

        for (int i = 0; i < iteraciones; i++) {
            System.out.println("test");
        }
        in.close();
    }
}