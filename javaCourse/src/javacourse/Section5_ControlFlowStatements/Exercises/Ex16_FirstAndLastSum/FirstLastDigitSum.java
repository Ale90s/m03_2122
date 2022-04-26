package javacourse.Section5_ControlFlowStatements.Exercises.Ex16_FirstAndLastSum;

public class FirstLastDigitSum {
    
    public static void main(String[] args) {
        
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(99));
    }

    public static int sumFirstAndLastDigit(int number) {
        
        if (number < 0) {
            return -1;
        }
        
        int firstDigit = 0, lastDigit = 0;
        
        firstDigit = number % 10;
        number /= 10;
        
        if (number <= 0) {
            lastDigit = firstDigit;
        }
        
        while (number > 0) {
            
            if (number <= 9) {
                lastDigit = number;
            }
            number /= 10;
            
        }
        
        return (firstDigit + lastDigit);
    }
}
