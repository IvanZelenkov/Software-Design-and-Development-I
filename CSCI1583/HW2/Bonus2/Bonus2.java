import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) {
        // initilizing UserGuess variable to store an initial guess and user input
        int UserGuess, UserInput;
        // declare boolean variables
        boolean CorrectGuess = false;
        boolean stepForward = true;
        boolean stepBack = false;

        // variable to store the number of guesses we have made
        int attempts = 0;
        // variable that will change the step int the selected range
        int step = 20;
        // initilizing variable to zero to start range
        int midRange = 0;

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
            }
            // if user Input 2 range will go up
            else if (UserInput == 2) {
                stepForward = true;
                // if stepBack will be True, will work this block of if statement
                if (stepBack) {
                    step = step / 2;
                    stepBack = true;
                }
            }
            // if user Input 3 range will go down
            else if (UserInput == 3) {
                stepBack = true;
                // if stepBack will be True(I made it always true from start of program, because when user enter 3, it will decrease number in two times(step/2))
                if (stepForward) {
                    step = step / 2;
                    stepForward = false;
                }
            }
            // if stepForward true, this block if will work
            if (stepForward)
                midRange += step;
            // if stepBack true, this block if will work
            else
                midRange -= step;
        }
        // closing Scanner
        scan.close();
    }
}

