package javacourse.Section5_ControlFlowStatements;

import java.util.Scanner;

public class ReadingUserInputchallenge {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = in.hasNextInt();

            if (isAnInt) {
                int number = in.nextInt();
                counter++;
                sum += number;
                
            } else {
                System.out.println("Invalid number");
            }

            in.nextLine(); // handle end of line (enter key)
        }

        System.out.println("sum = " + sum);
        in.close();

    }
}
