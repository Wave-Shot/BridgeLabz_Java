// BankAccount class models a bank account
class BankAccount {

    // public variable
    // Accessible everywhere
    public long accountNumber;

    // protected variable
    // Accessible within subclass and same package
    protected String accountHolder;

    // private variable
    // Sensitive data → encapsulated
    private double balance;

    /*
     * Method to deposit money into account
     */
    public void deposit(double amount) {

        // Increase balance safely
        balance += amount;
    }

    /*
     * Method to withdraw money
     * Ensures balance does not go negative
     */
    public void withdraw(double amount) {

        // Validate sufficient balance
        if (amount <= balance) {
            balance -= amount;
        }
    }

    /*
     * Getter method to check balance
     * No direct access to balance variable
     */
    public double getBalance() {

        return balance;
    }
}

// SavingsAccount subclass
// Demonstrates inheritance access rules
class SavingsAccount extends BankAccount {

    /*
     * Method to display savings account details
     */
    public void displayAccountInfo() {

        // accountNumber is public → accessible
        System.out.println("Account Number: " + accountNumber);

        // accountHolder is protected → accessible
        System.out.println("Account Holder: " + accountHolder);

        // balance is private → NOT accessible
        // Must use getter
        System.out.println("Balance: " + getBalance());
    }
}
