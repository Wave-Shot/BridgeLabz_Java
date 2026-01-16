/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of
 * access modifiers (public, protected, private)
 * and inheritance using a BankAccount example.
 */

/*
 * Class Name: BankAccount
 *
 * Description:
 * This class models a bank account and demonstrates
 * how different access modifiers control visibility
 * of variables and methods.
 */
class BankAccount {

    // Public variable
    // Accessible from anywhere
    public long accountNumber;

    // Protected variable
    // Accessible within same package and subclasses
    protected String accountHolder;

    // Private variable
    // Accessible only within this class (encapsulation)
    private double balance;

    /*
     * Method to deposit money into the account
     */
    public void deposit(double amount) {

        // Increase balance safely
        balance += amount;
    }

    /*
     * Method to withdraw money from the account
     * Ensures balance does not become negative
     */
    public void withdraw(double amount) {

        // Validate sufficient balance before withdrawal
        if (amount <= balance) {
            balance -= amount;
        }
    }

    /*
     * Getter method to retrieve balance
     * Provides controlled access to private variable
     */
    public double getBalance() {

        // Return current account balance
        return balance;
    }
}

/*
 * Class Name: SavingsAccount
 *
 * Description:
 * This subclass extends BankAccount and demonstrates
 * inheritance and access to public and protected members,
 * while private members remain inaccessible.
 */
class SavingsAccount extends BankAccount {

    /*
     * Method to display savings account details
     */
    public void displayAccountInfo() {

        // accountNumber is public → accessible
        System.out.println("Account Number: " + accountNumber);

        // accountHolder is protected → accessible in subclass
        System.out.println("Account Holder: " + accountHolder);

        // balance is private → NOT directly accessible
        // Accessed using public getter method
        System.out.println("Balance: " + getBalance());
    }
}
