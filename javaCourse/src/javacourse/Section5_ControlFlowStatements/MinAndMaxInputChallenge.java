package javacourse.Section5_ControlFlowStatements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int max = 0, min = 0, n;
        boolean noNumbersAlready = true;

        while (true) {

            System.out.println("Enter Number: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (noNumbersAlready) {
                    max = n;
                    min = n;
                    noNumbersAlready = false;
                } else if (max < n) {
                    max = n;
                } else if (min > n) {
                    min = n;
                }

            } else {
                in.close();
                break;
            }
        }

        if (!noNumbersAlready) {
            System.out.println("Max number introduced: " + max);
            System.out.println("Min number introduced: " + min);
        } else {
            System.out.println("You didn't introduce any number...");
        }

    }
}
