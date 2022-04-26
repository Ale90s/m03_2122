package javacourse.Section5_ControlFlowStatements.Exercises.Ex27_Inputcalculator;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner in = new Scanner(System.in);
        int n, sum = 0, counter = 0;
        long average = 0;
        boolean finish = false;

        do {
            if (in.hasNextInt()) {
                n = in.nextInt();
                sum += n;
                counter++;
            } else {
                finish = true;
            }

        } while (!finish);

        if (counter > 0) {
            average = Math.round((double) sum / counter);
        }

        System.out.printf("SUM = %d AVG = %d%n", sum, average);

    }
}
