package udemy_Java_section4;

public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        int myVariable = 50; // Entire line is a Java Statement
        if (myVariable == 50) {
            System.out.println("Printed");
        } // if statement
        myVariable++; // Another Java Statement
        myVariable--; // Another Java Statement
        System.out.println("This is a test"); // Another Java Statement

        System.out.println("This is" + /* Lines 10 - 11 are a valid Java Statement */
                "another" + "Java Statement.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }// main
}// class