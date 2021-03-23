public class ExamPart2 {

    public static void main(String[] args) {


        System.out.println("QUESTION 5 EVALUATIONS");
		/*
			QUESTION 5: Operators and Evaluation.
			You will be given a collection of java statements.
			If you compile and run this file, you will
			see what gets printed out for each one.
			There are two parts to each of these questions:
			part 1 (0.5 points): write out what the result is. Easy points! Running the program gives this to you!
			part 2 (1.5 poitns): explain, in your own words, why that is the result.
		*/
        System.out.print("First evaluation:   ");
        //First evaluation: !(1*3 != 3)
        System.out.println(!(1 * 3 != 3));
        //this evaluates to: true
        //Because: when we multiply 1 on 3 we get 3 and in parenthesis it should not be equal 3, but like we see it equals. But we have ! sign which means if result inside the parenthesis not equal or false therefore answer is true


        System.out.print("Second evaluation:   ");
        //Second evaluation: (10.0 >= 11.0) || (5 % 6 == 0)
        System.out.println((10.0 >= 11.0) || (5 % 6 == 0));
        //this evaluates to: false
        //Because: left part is false right part is false therefore all result false


        System.out.print("Third evaluation:   ");
        //Third evaluation: 245 * 2 + 14 + "eva!"
        System.out.println(245 * 2 + 14 + "eva!");
        //this evaluates to: 504eva!
        //Because: first part calculates because program do not understand that it meets string yet, so it calculates numbers and get 504 and after see that there is a string, therefore will work concatenation to String


        System.out.print("Fourth evaluation:   ");
        //Fourth evaluation: -5.0 * (6 + 3) /4
        System.out.println(-5.0 * (6 + 3) / 4);
        //this evaluates to: -11.25
        //Because: first step of calculation is (6+3) = 9, next -5.0 * 9 = -45 and after -45.0 / 4 we get -11.25 because we have floating number so it does not cut number. Another words we get precise number.


        System.out.print("Fifth evaluation:   ");
        //Fifth evaluation: 45 / 4
        System.out.println(45 / 4);
        //this evaluates to: 11
        //Because: here we get 11 because of the integer(int) number, it shows entire number without decimals.

        System.out.println("-----------------------");


        System.out.println("QUESTION 6 LEGAL IDENTIFIERS");

		/*
			QUESTION 6: LEGAL IDENTIFIERS
			You will be given three potential identifiers (i.e., variable names)
			For each one, state the following:
			A) Whether it is or isn't a legal identifier.
			B) If it *isn't* legal, explain why.
			(You may feel free to test these yourself if you wish by declaring them
			as variables and seeing what the compiler says!)
		*/
        //IDENTIFIER #1
        //Is the identifier 4VertexPolyhedron valid? invalid
        System.out.println("4VertexPolyhedron");

        //Answer (if not legal, explain why): 4VertexPolyhedron is not valid identifier because we cannot start writing variables from number


        //IDENTIFIER #2
        //Is the identifier aVeryLongVariableName valid? valid
        System.out.println("aVeryLongVariableName");

        //Answer (if not legal, explain why): aVeryLongVariableName is leagl indentifier


        //IDENTIFIER #3
        //Is the identifier student'sName valid? invalid
        System.out.println("student'sName");

        //Answer (if not legal, explain why): student'sName is not valid because we see '  sign between word. it is prohibited


    }
}

