// Ivan Zelenkov (Problem 3: Paper Please)
import java.util.*;

public class PapersPlease {
    public static void main(String[] args) {
        boolean Passport = false;
        boolean driverLicense = false;
        boolean birthCerificate = false;

        Scanner scan = new Scanner(System.in);
        boolean check1 = scan.nextBoolean();
        boolean check2 = scan.nextBoolean();
        boolean check3 = scan.nextBoolean();

        if (check1 == true)
            System.out.println(check1);
        else if (check2 == true && check3 == true)
            System.out.println(check2);
        else if (check2 != true && check3 == true)
            System.out.println(check2);
        else if (check2 == true && check3 != true)
            System.out.println(check3);
        else
            System.out.println(check1);



    }
}
