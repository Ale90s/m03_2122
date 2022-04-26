package javacourse.Section5_ControlFlowStatements.Exercises.Ex18_SharedDigit;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number, int numberTwo) {

        if ((number < 10 || number > 99) || (numberTwo < 10 || numberTwo > 99)) {
            return false;
        }

        int firstN = number % 10, secondN = number / 10,
                thirdN = numberTwo % 10, fourthN = numberTwo / 10;

        if ((firstN == thirdN || firstN == fourthN) || (secondN == thirdN || secondN == fourthN)) {
            return true;
        }
        return false;
    }
}
