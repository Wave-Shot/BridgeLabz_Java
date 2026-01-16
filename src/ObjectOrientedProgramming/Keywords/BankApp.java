package ObjectOrientedProgramming.Keywords;

/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * static, final, this, and instanceof keywords
 * using a BankAccount example.
 */

/*
 * Class Name: BankAccount
 *
 * Description:
 * This class represents a bank account and demonstrates:
 * - static variables and methods
 * - final variables
 * - this keyword
 * - instanceof keyword
 */
class BankAccount {

    // Static variable shared by all BankAccount objects
    static String bankName = "Indian Bank";

    // Static variable to keep track of total number of accounts
    static int noOfAccount = 0;

    // Private variable to store account holder name (encapsulation)
    private String accountHolderName;

    // Final variable ensures account number cannot be changed
    private final long accountNumber;

    // Constructor to initialize account details
    BankAccount(String accountHolderName, long accountNumber) {

        // Using this keyword to resolve naming ambiguity
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        // Increment static account count whenever a new account is created
        noOfAccount++;
    }

    // Method to display account details
    public void displayDetails() {

        // Using instanceof to verify object type
        if (this instanceof BankAccount) {

            // Accessing static variable
            System.out.println("Bank Name : " + bankName);

            // Display account holder name
            System.out.println("Account Holder: " + accountHolderName);

            // Display final account number
            System.out.println("Account Number: " + accountNumber);

        } else {
            System.out.println("Invalid object");
        }
    }

    // Static method to return total number of accounts
    public static int getTotalAccounts() {

        // Returning static counter value
        return noOfAccount;
    }
}

/*
 * Class Name: BankApp
 *
 * Description:
 * This class contains the main method and demonstrates
 * object creation, static method access, and keyword usage.
 */
public class BankApp {

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating first BankAccount object
        BankAccount acc1 = new BankAccount("Aayush", 6752439998911L);

        // Creating second BankAccount object
        BankAccount acc2 = new BankAccount("Gautam", 5788882734766L);

        // Displaying details of first account
        acc1.displayDetails();

        System.out.println("--------------------------------");

        // Displaying details of second account
        acc2.displayDetails();

        // Displaying total number of accounts using static method
        System.out.println("\nTotal number of accounts: " + BankAccount.getTotalAccounts());
    }
}
