import java.util.*; // call class * to activate Scanner

public class ExamPart5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner
        System.out.println("Enter 3 numbers:"); // Prompt to the user
        int firstNumber = input.nextInt(); // create int variable where usere will type integer value
        double secondNumber = input.nextDouble(); // create double variable where usere will type integer value
        double thirdNumber = input.nextDouble(); // create double variable where usere will type integer value

        double result = 0; // initialized variable result to double and initialized to 0
        result = calculate(firstNumber, secondNumber, thirdNumber); // made variable result, therefore there method calculate will be called
        System.out.println(result); // show result


    }
    public static double calculate(int x, double y, double z) { // declaring method calculate to double
        double formula = x * (y + z); //declared variable formula to double type and made formula to calculate the needed result ot the user
        return formula; // return statement because we did not write void, so formula will return value


    }
}
//This file contains the following questions:
//QUESTION 9: Full Program from Scratch (6 points)(+4 bonus)
/*
Write a program in Java that will calculate an expression and print the output of the
expression. The calculation must be done inside a user defined method named calculate.

The method calculate should have a return type double and must take 3 arguments -
int x, double y, double z. The expression you have to calculate inside this method is-

x * (y + z)

(You may hard-code these literals. However, to receive the bonus, you must receive
the inputs from user)

Below this comment, write the entire program, including the class, the method calculate
and the main method.

Note: because this file is called Exam1Part5.java, your class will also have to be
called Exam1Part5
*/