package udemy_Java_section4;

public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // if (gameOver) {
        // int finalScore = score + (levelCompleted * bonus);
        // System.out.println("Your final score was " + finalScore);
        // System.out.println();
        // } // if statement

        calculateScore(gameOver, score, levelCompleted, bonus);

    }// main

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            System.out.println();
            return finalScore;
        } // if statement
        else {
            return -1;
        } // else statement
    }// calculateScore Method
}// class