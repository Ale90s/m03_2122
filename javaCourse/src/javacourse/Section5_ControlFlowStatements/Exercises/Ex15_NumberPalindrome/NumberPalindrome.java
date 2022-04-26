package javacourse.Section5_ControlFlowStatements.Exercises.Ex15_NumberPalindrome;

public class NumberPalindrome {

    public static void main(String[] args) {

        boolean palindrome = isPalindrome (0);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= (-1);
        }
        
        int n = number, reverse = 0, lastDigit = 0;

        do {

            lastDigit = n % 10;
            reverse += lastDigit;
            reverse *= 10;
            n /= 10;

        } while (n > 0);
        
        reverse /= 10;
        
        if (reverse == number) {
            return true;
        }

        return false;
    }
}
