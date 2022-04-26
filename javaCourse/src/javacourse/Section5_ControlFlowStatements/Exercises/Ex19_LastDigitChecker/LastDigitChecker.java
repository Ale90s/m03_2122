package javacourse.Section5_ControlFlowStatements.Exercises.Ex19_LastDigitChecker;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int nOne, int nTwo, int nThree) {

        if (!isValid(nOne) || !isValid(nTwo) || !isValid(nThree)) {
            return false;
        }

        nOne %= 10;
        nTwo %= 10;
        nThree %= 10;
        
        if ((nOne == nTwo) || (nOne == nThree) || (nTwo == nThree)) {
            return true;
        }
        return false;
    }
    
    public static boolean isValid (int n) {
        
        if (n >= 10 && n <= 1000) {
            return true;
        }
        
        return false;
    }
}
