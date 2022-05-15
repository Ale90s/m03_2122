import java.util.Scanner;

public class Pruebas4 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = 5, aux = a;
        
        for (int i = 0; i < 10; i++) {
            
            a++;
            
            if(a == aux + 3) {
                a = 0;
            }
            
        }
        in.close();
    }
}
