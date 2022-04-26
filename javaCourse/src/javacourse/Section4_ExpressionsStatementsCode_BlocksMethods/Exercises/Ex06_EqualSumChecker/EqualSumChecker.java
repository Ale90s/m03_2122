package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex06_EqualSumChecker;

public class EqualSumChecker {
    
    public static boolean hasEqualSum (int nOne, int nTwo, int nThree) {
        
        if ((nOne + nTwo) == nThree) {
            return true;
        }
        return false;
    }
}
