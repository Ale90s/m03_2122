package javacourse.Section5_ControlFlowStatements;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int number = 870, n = 0, counter = 0;

        for (int i = number; i < 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {

                n += i;
                counter++;
                if (counter == 5) {
                    break;
                }
            }
        }
        System.out.println(n);
    }
}
