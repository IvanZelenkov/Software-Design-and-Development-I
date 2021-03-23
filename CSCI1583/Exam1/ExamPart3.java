//This file contains the following questions:
//QUESTION 7: Six Code Listings (5 points each, 30 points total)




public class ExamPart3 {

    public static void main(String[] args) {


        System.out.println("QUESTION 7 CODE ANALYSIS");
		/*
			QUESTION 7: CODE ANALYSIS.
			You will be given six short code snippets. For each one, do the following:

			1.) Write a comment on each line, explaining what the line does.
			2.) Write the output of the snippet (you can get this from compiling and running this file)
			3.) Explain, in your own words, "what's going on" with the code snippet.

			IMPORTANT NOTE: After you answer the questions for each snippet, you may
			find it helpful to comment the snippet out before moving on to the next one.
		*/

        System.out.println("Snippet One:");

        int i=1; //we are declaring at first i variable and initializing it to 5
        while (i<=5) { //while loop, with condition while i less or equal 5 it will run, but we have no incremet to variable i, therefore it will be infinite loo which will never stop
        	System.out.println("i= " + i); //output of the user will be continue constantly
        }

        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */


        System.out.println("---------------------");

        System.out.println("Snippet Two:");

        int j = 6; //we are declaring at first j variable and initializing it to 6
        while (j <= 5) { // while loop, with condition while j less or equal 5 it will run
            System.out.println("j= " + j); //while loop will never work because j = 6 and while loop has condition i less or equal 5. So the user will se only text Snippet Two:
        }

        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */

        System.out.println("---------------------");

        System.out.println("Snippet Three:");

        int k = 6; //we are declaring at first k variable and initializing it to 6
        do {
            System.out.println("k= " + k);
        } while (k <= 5); // output will be showed only once because of the do...while loop. After it will not execute, becauase i = 6 will be false in whule loop (k <= 5)

        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */

        System.out.println("---------------------");

        System.out.println("Snippet Four:");

        int x = 14; //we are declaring at first x variable and initializing it to 14
        if (x == 3 * 5) { //if value x is equal 3*5 = 15 therefore print to the user (x is the product of 3 and 5), if not equals 15 print (x is NOT the product of 3 and 5)
            System.out.println("x is the product of 3 and 5");
        } else {
            System.out.println("x is NOT the product of 3 and 5");
        }


        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */


        System.out.println("---------------------");

        System.out.println("Snippet Five:");

        int y = 1; //we are declaring at first y variable and initializing it to 1
        while (y <= 10) { //while y less or equal 10 execute if and if statement will execute only if y variable will be divided by 2 without remainder, another words with remainder 0;
            if (y % 2 == 0) {
                System.out.println(y); // we will see outpu of y value if (if) statement will work
            }
            y++; // it will increment number y = 1 each time so if we started from it will not go to if statement, because it will go to y++ which will be 2 and after again 3 which is not good, so it again goes to y++ and will be 4 and so on to 10
        }


        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */


        System.out.println("---------------------");

        System.out.println("Snippet Six:");

        for (int z = 1; z <= 10; z++) { //we decalred z variable and initialized to 1, after goes condition z less or equal 10 and each time when it runs increment it by 1
            if (z % 2 == 0) { // we have if statement which will check even numbers, therefeore why we have for loop. it will check even numbers from  1 to 10 (2,4,6,8,10(included))
                System.out.println(z);
            }
        }


        //1) leave a short comment on each line of code above explaing what it does.
        //2) What is the output of the above snippet? Write it in the block comment below:
        /*


         */
        //3.) Explain, in your own words, "what's going on" with the above code snippet in the block commend below:
        /*


         */


    }
}
