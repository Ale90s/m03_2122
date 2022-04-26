package m03.uf1.pa1.alejandroalgarra;

public class CoolNumbersJuan {

    public static void main(String[] args) {
        int n, op;
        System.out.print("Els nombres 'cool' són: ");
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    n = i * 100 + j * 10 + k;
                    op = i * i * i + j * j * j + k * k * k;
                    if (n == op) {
                        System.out.printf("%d ", n);
                    }
                }
            }
        }
        System.out.println("");
    }
}
