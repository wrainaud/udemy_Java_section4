package udemy_Java_section4;

public class IfKeywordsAndCodeblocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // if (score < 5000 && score > 1000) {
        //     System.out.println("Your score was less than 5000 but greater than 1000!");
        // }//if statement
        // else if (score < 1000){
        //     System.out.println("Your score was less than 1000!");
        // }//else if statement
        // else{
        //     System.out.println("Got here! ");
        // }//if statement

        if (gameOver = true){
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("We the best!");

        }//if statement
    }//main
}//class