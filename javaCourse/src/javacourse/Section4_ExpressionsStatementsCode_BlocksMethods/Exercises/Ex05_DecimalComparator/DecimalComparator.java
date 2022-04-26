package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex05_DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double nOne, double nTwo) {
        
        if ((int)(nOne * 1000) == (int)(nTwo * 1000)) {
            return true;
        }
        return false;
    }
}
