import jdk.jshell.Snippet;

import java.sql.SQLOutput;
import java.util.Currency;
import java.util.Scanner;

public class atmmachine {
    public static void main(String[] args) {

        double balance = 248.30;

        {
            Scanner scnr = new Scanner(System.in);
            System.out.print("Please Enter Username:");
            String name = scnr.next();

            System.out.print("Please Enter Password:");
            String password = scnr.next();

            if ((name == "Joe") && password == "Fortnite");
            System.out.println("Access Granted!\nEnter 1 to Check Account Balance\nPress 2 to Withdraw\nPress 3 to Deposit");

            System.out.print("Please Enter Choice Here: ");
            int option = scnr.nextInt();
            if (option == 1) {
                System.out.print("Your Balance Is : " + balance);
            }
            if (option == 2) {
                System.out.print("How Much Would You Like To Withdraw?:");
                double withdraw = scnr.nextDouble();
                System.out.print("Your New Balance Is: "+(balance-withdraw));
            }
            if (option ==3) {
                System.out.println("How Much Would You Like To Deposit?: ");
                double deposit = scnr.nextDouble();
                System.out.print("Your New Balance Is: " + (balance+deposit));

            }
        }
    }
}
