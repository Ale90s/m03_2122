package javacourse.Section5_ControlFlowStatements.Exercises.Ex14_SumOdd;

public class SumOddRange {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(-1, 100));
    }

    public static boolean isOdd(int number) {

        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        int n = 0;

        if (start > 0 && end > 0) {
            if (start <= end) {

                for (int startAux = start; startAux <= end; startAux++) {
                    if (isOdd(startAux)) {
                        n += startAux;
                    }
                }

                return n;
            }
        }
        return -1;
    }
}
