package udemy_Java_section4;

public class IfKeywordsAndCodeblocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // if (score < 5000 && score > 1000) {
        // System.out.println("Your score was less than 5000 but greater than 1000!");
        // }//if statement
        // else if (score < 1000){
        // System.out.println("Your score was less than 1000!");
        // }//else if statement
        // else{
        // System.out.println("Got here! ");
        // }//if statement

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            System.out.println();
        } // if statement

        // int savedFinalScore = finalScore; Variable finalScore cannot be accessed as
        // it is out of scope.

        // Challenge
        // Print out o sceond score on the screen with the following
        // score set to 1000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            System.out.println();
        } // if statement

    }// main
}// class