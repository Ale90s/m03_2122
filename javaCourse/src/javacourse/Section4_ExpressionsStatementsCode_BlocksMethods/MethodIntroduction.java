package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods;

public class MethodIntroduction {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
            //If you achieve to return one value next values aren't going to reach at all.

        } else {
            return -1;
        }

    }
}