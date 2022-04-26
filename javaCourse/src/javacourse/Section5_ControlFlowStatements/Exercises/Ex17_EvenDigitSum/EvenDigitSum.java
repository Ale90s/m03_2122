package javacourse.Section5_ControlFlowStatements.Exercises.Ex17_EvenDigitSum;

public class EvenDigitSum {

    public static void main(String[] args) {
        
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        
        int sum = 0, separatedlyDigit;
        
        while (number > 0) {
            
            separatedlyDigit = number % 10;
            number /= 10;
            if (separatedlyDigit % 2 == 0) {
                sum += separatedlyDigit;
            }
        }
        return sum;
    }
}
