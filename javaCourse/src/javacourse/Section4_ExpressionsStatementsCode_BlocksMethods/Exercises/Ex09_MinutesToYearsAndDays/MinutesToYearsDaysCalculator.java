package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods.Exercises.Ex09_MinutesToYearsAndDays;

public class MinutesToYearsDaysCalculator {
    
    public static void printYearsAndDays (long minutes) {
        
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (minutes / 60 / 24 / 365);
            long days = (minutes - (years * 60 * 24 * 365)) / 60 / 24;
            
            System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
        }
    }
}
