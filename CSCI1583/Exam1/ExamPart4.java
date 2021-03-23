//This file contains the following questions:
//QUESTION 8: Algorithm Completion (4 points)


import java.util.Scanner;

public class ExamPart4 {

    public static void main(String[] args) {


        System.out.println("QUESTION 8 Algorithm Completion");
		/*
			Complete the following short algorithm in Java that will
			convert a dollar value double (ex. 1.25) entered at the keyboard into an int
			representing how many nickels that value would represent.

			Store this value in a variable called numNickels.

			If it is not cleanly divisible, numNickels should be set with the
			largest whole number integer value (i.e. eleven cents, 0.11, represents 2 nickels).

			Print out numNickels to the screen
		*/

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a dollar value with 2 decimal places: ");
        double dollarValue = input.nextDouble();

        //converting double to intger by tapcasting
        int numNickels = (int) (dollarValue * 20);

        //displaying int value after conversion
        System.out.println(numNickels);

        // TODO: initialize numNickels based on the above specification.

        //TODO: Print the value of numNickels to the screen.

    }
}
