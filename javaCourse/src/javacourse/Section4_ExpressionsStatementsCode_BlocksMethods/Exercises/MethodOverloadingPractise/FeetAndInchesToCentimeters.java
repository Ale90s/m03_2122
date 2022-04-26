package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.MethodOverloadingPractise;

public class FeetAndInchesToCentimeters {
    
    public static void main(String[] args) {
        
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        System.out.println(centimeters + "cm");
    }
    
    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (inches + calcFeetAndInchesToCentimeters(feet)) * 2.54;
            // Return centimeters
        }
        
        return -1;
    }
    
    public static double calcFeetAndInchesToCentimeters (double inches) {
        
        if (inches >= 0) {
            return inches * 12; 
            // It calculate how many feet are in this quantity of inches
        }
        
        return -1;
    }
}
