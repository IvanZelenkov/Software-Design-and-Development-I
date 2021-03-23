package Lab8;// Ivan Zelenkov Problem 4 (ATM Banking)

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accounts = null;

    //constructor ATM
    public ATM(ArrayList<Account> arl) {
        this.accounts = arl;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}