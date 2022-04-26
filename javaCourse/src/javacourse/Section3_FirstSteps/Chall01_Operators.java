package javacourse.Section3_FirstSteps;

public class Chall01_Operators {

    public static void main(String[] args) {

        double op1 = 20.00d, op2 = 80.00d, opTotal;
        boolean isOp1RemainderZero;

        opTotal = (op1 + op2) * 100;

        opTotal %= 40.00d;

        isOp1RemainderZero = (op1 == 0) ? true : false;

        System.out.println(isOp1RemainderZero);

        if (!isOp1RemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}