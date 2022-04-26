package javacourse.Section5_ControlFlowStatements.Exercises.Ex13_NumberDaysInMonth;

public class NumberOfDaysInMonth {
    
    public static void main (String[] args) {
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
    }

    public static boolean isLeapYear(int year) {

        if (year > 0 && year < 10000) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        
         if (year > 0 && year < 10000) {     
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
               
                    if (isLeapYear(year)) {
                        return 29;
                    }
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1; 
            }
         } else {
             return -1;
         }
    }
}
