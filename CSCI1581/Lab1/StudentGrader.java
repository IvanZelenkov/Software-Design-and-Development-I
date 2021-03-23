// Ivan Zelenkov (Problem 5: Student Grader)
import java.util.*;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float Test = scan.nextFloat();
        float Homework = scan.nextFloat();
        float Lab = scan.nextFloat();

        float formula = Test*0.4f + Lab*0.1f + Homework*0.5f;
        System.out.println(formula);
    }
}
