package javacourse.Section5_ControlFlowStatements.Exercises.Ex20_GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }
    
    public static int getGreatestCommonDivisor (int first, int second) {
        
        if (first < 10 || second < 10) {
            return -1;
        }
        int n = 0, counter = 1;
        
        do {
            if (first % counter == 0 && second % counter == 0) {
                n = counter;
            }
            counter++;
        } while (first >= counter && second >= counter);
        
        return n;
    }
}
