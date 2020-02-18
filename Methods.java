package udemy_Java_section4;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }// main

    public static void displayHighScorePosition(String playersName, int highScorePosition) {
        System.out.println(
                playersName + " managed to get into position " + highScorePosition + " on the high score table.");
    }// displayHighScorePosition Method

    public static int calculateHighScorePosition(int playerScore) {

        // if (playerScore >= 1000) {
        // return 1;
        // } // if statement
        // else if (playerScore >= 500) {
        // return 2;
        // } // else if statement
        // else if (playerScore >= 100) {
        // return 3;
        // } // else if statement
        // return 4;

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } // if statement
        else if (playerScore >= 500) {
            position = 2;
        } // else if statement
        else if (playerScore >= 100) {
            position = 3;
        } // else if statement

        return position;

    }// calculateHighScorePosition Method

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            // System.out.println("Your final score was " + finalScore);
            return finalScore;
        } // if statement
        else {
            return -1;
        } // else statement
    }// calculateScore Method

}// class