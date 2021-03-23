// Ivan Zelenkov (Problem 4: Bouncer Bot)
import java.util.*;

public class BouncerBot {
    public static void main(String[] args) {
        boolean yes = true;
        boolean no = false;

        Scanner scan = new Scanner(System.in);

        int currentMonth = scan.nextInt();
        int currentDay = scan.nextInt();
        int currentYear = scan.nextInt();

        int birthMonth = scan.nextInt();
        int birthDay = scan.nextInt();
        int birthYear = scan.nextInt();

        int year = currentYear - birthYear;

        if (birthMonth == currentMonth) {
            if (birthDay > currentDay)
                year--;
        }
        else if (birthMonth > currentMonth)
            year--;


        if (year >= 21 && birthMonth == currentMonth && birthDay == currentDay)
            System.out.println(yes);
        else
            System.out.println(no);
    }
}
