package Lab8;// Ivan Zelenkov Problem 4 (ATM Banking)

import java.util.ArrayList;
import java.util.Scanner;

public class AccountTester {

    public static void main(String[] args) {
        String pin;
        int number;

        Scanner input = new Scanner(System.in);
        Account acc1 = new Account("Tim", "1234");
        Account acc2 = new Account("Ted", "9999");
        ArrayList<Account> array = new ArrayList<>();
        array.add(acc1);
        array.add(acc2);

        ATM acc = new ATM(array);
        pin = input.next();

        int choice = 0, index = 0;
        for (int i = 0; i < acc.getAccounts().size(); i++) {
            if (acc.getAccounts().get(i).isPin(pin)) {
                choice = 1;
            }
        }
        if (choice == 1) {
            number = input.nextInt();
            switch (number) {
                case 1: {
                    double amt = input.nextDouble();
                    acc.getAccounts().get(index).deposit(amt);
                    break;
                }
                case 2: {
                    double amt = input.nextDouble();
                    acc.getAccounts().get(index).withdraw(amt);
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println(acc.getAccounts().get(index));
        }
        else
            System.out.println("Incorrect Pin");
    }
}
