package Exp4;
import java.util.*;
public class Banking {
    static int b = 5000;
    static Scanner sc = new Scanner(System.in);
    static double r = 0.8;
    void createAccount() {
        int acc_no;
        String name;
        System.out.println("Enter the following details: ");
        System.out.print(" Enter the name of the Account Holder: ");
        name = sc.nextLine();
        System.out.print(" Enter the Account Number: ");
        acc_no = sc.nextInt();
    }
    int depositAccount() {
        int deposit_ammount;
        System.out.print(" Enter the ammount to be deposited: ");
        deposit_ammount = sc.nextInt();
        b = b + deposit_ammount;
        return b;
    }
    int withdrawAccount() {
        int w;
        System.out.print(" Enter the Ammount to be withdrawn: ");
        w = sc.nextInt();
        if (w > b) {
            System.out.println(" Not Enough Money! ");
        } else {
            b = b - w;
        }
        return b;
    }
    double calculateInterest() {
        double c = b * (0.25) * r;
        return c;
    }
    void displayBalance() {
        System.out.println(" The Balance is: " + b);
    }
}
class Bank {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static int x;
    static double z;
    public static void main(String[] args) {
        Banking ic = new Banking();
        do {
            System.out.println("1.Create Account\n2.Deposit\n3.Withdraw\n4.Compute Interest\n5.Balance\n6.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ic.createAccount();
                    break;
                case 2:
                    x = ic.depositAccount();
                    System.out.println(" Total Ammount is: " + x);
                    break;
                case 3:
                    x = ic.withdrawAccount();
                    System.out.println(" Total Ammount is: " + x);
                    break;
                case 4:
                    z = ic.calculateInterest();
                    System.out.println(" Total Interest is: " + z);
                    break;
                case 5:
                    ic.displayBalance();
                    break;
            }
        } while (choice != 6);
    }
}