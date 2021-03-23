import java.util.Scanner;

public class Bonus1 {

    public static void main(String[] args) {
        // lowest and highest possible numbers
        int lowRange = 0, highRange = 100;

        // initilizing UserGuess variable to store an initial guess and user input
        int UserGuess = 0, UserInput;

        // boolean variable which represents if we reached the correct guess
        boolean CorrectGuess = false;

        // variable to store the number of guesses we have made
        int attempts = 0;

        // Initializing a Scanner object
        Scanner scan = new Scanner(System.in);

        // Prompt the user to choose a number
        System.out.println("Think a number between 0 and 100.");

        // declaring a list to store all possible guesses
        int[] list = new int[101];

        // initializing the list with elements
        for (int i = 0; i <= 100; i++)
            list[i] = i;

        // while loop till the boolean variable CorrectGuess equal true
        while (!CorrectGuess) {
            // find the middle index of list range between lowRange and highRange
            int midRange = lowRange + (highRange - lowRange) / 2;

            // make UserGuess as the element stored with the middle index
            UserGuess = list[midRange];

            // increment attempts
            attempts++;

            // present guess to the user
            System.out.println("Is " + UserGuess + " the number?");
            System.out.println("Enter 1 if this was a correct guess, 2 if your number is higher, and 3 if your number is lower:");

            // storing user input
            UserInput = scan.nextInt();

            // choosing the correct option to continue
            if (UserInput == 1) {
                CorrectGuess = true;
                System.out.println("Computer spent " + attempts + " tries to guees your number!");
            } else if (UserInput == 2)
                // if user number is higher then update the lowRange limit
                lowRange = midRange;
            else if (UserInput == 3)
                // if user number is lower then update the highRange limit
                highRange = midRange;
        }
        // boolean variable which represents if we reached the correct guess
        boolean validAnswer = false;

        // while loop till the boolean variable CorrectGuess equal true
        while (!validAnswer) {
            // present guess to the user
            System.out.println("Enter 1 if this was a correct guess, 2 to restart program, and 3 if your number is wrong");

            // make UserGuess as the element stored with the middle index
            UserInput = scan.nextInt();

            // choosing the correct option to continue
            if (UserInput == 1) {
                System.out.println("Guessed in " + attempts + " attempts correctly!");
                validAnswer = true;
            }
            else if (UserInput == 2)
                // choosing the 2, user will restart game
                main(new String[0]);
            else
                // present text to the user
                System.out.println("ERROR! Please type '2' to restart the program and start again!");
        }
    }
}
