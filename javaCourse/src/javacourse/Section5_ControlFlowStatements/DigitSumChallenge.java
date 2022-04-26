package javacourse.Section5_ControlFlowStatements;

public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(99999));
        System.out.println(sumDigits(-99999));
    }

    public static int sumDigits(int number) {

        int n = number, sum = 0, separatedlyDigit;

        if (number > 9) {
            while (n > 0) {
                separatedlyDigit = n % 10;
                n /= 10;
                sum += separatedlyDigit;
            }
        }

        if (number < 9) {
            return -1;
        } else {
            return sum;
        }
    }
}
