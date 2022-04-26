package javacourse.Section4_ExpressionsStatementsCode_BlocksMethods;

public class zEx01_MethodChallenge01 {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 900, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(40);
        displayHighScorePosition("Gilbert", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {

            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
            //If you achieve to return one value next values aren't going to reach at all.

        } else {
            return -1;
        }

    }

    public static void displayHighScorePosition (String playerName, int highScorePosition) {

        System.out.println(playerName + " managet to get into position " +
            highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
           position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
