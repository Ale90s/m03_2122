package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods;

public class MethodOverloading {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
    
    /* BAD PRACTICE OF METHOD OVERLOADING */
    
    public static int sumTwoNumbers (int a, int b) {
        return a + b;
    }
    public static int sumThreeNumbers (int a, int b, int c) {
        return a + b + c;
    }
    public static int sumFourNumbers (int a, int b, int c,  int d) {
        return a + b + c + d;
    }
    
    /* GOOD PRACTICE OF METHOD OVERLOADING */
    
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    public static int sum (int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
