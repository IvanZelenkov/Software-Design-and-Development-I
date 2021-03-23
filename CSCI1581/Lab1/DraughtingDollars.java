// Ivan Zelenkov (Problem 1: Draughting Dollars)
import java.util.*;

public class DraughtingDollars {
    public static void main(String[] args) {
        double kegGallon = 15.5;
        int gallonOunces = 128;
        int pintOunces = 16;

        double kegRatio;
        double priceOfPint;
        double priceOfKeg;

        Scanner input = new Scanner(System.in);
        kegRatio = input.nextDouble();
        priceOfPint = input.nextDouble();

        double kegInOunces = kegGallon * gallonOunces;

        double ouncesLeft = kegInOunces * kegRatio;

        int pintsLeft = (int)( ouncesLeft / pintOunces );

        priceOfKeg = priceOfPint * pintsLeft;

        System.out.printf("There is $%.2f of beer left in keg\n", priceOfKeg);
    }
}
