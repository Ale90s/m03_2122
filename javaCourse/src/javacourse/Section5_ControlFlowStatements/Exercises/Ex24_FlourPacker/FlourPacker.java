package javacourse.Section5_ControlFlowStatements.Exercises.Ex24_FlourPacker;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(0, 5, 6));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount > 0) {
            while (goal > 4 && bigCount > 0) {
                goal -= 5;
                bigCount--;
            }
        }
        if (smallCount > 0) {
            while (goal > 0 && smallCount > 0) {
                goal -= 1;
                smallCount--;
            }
        }
        return goal == 0;
    }
}
