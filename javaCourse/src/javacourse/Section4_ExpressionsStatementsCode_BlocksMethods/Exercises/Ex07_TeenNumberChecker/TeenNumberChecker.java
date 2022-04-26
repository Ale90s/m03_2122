
package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex07_TeenNumberChecker;

public class TeenNumberChecker {

    public static boolean hasTeen (int nOne, int nTwo, int nThree) {
        
        if (nOne > 12 && nOne < 20) {
            return true;
        } else if (nTwo > 12 && nTwo < 20) {
            return true;
        } else if (nThree > 12 && nThree < 20) {
            return true;
        }
        return false;
    }
    
    public static boolean isTeen (int n) {
        
        if (n > 12 && n < 20) {
            return true;
        }
        return false;
    }
}
