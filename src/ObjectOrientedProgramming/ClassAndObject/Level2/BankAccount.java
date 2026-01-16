// BankAccount class represents a bank account
class BankAccount {

    // Attribute to store account holder name
    String accountHolder;

    // Attribute to store account number
    long accountNumber;

    // Attribute to store current balance
    double balance;

    /*
     * Method to deposit money into account
     */
    void deposit(double amount) {

        // Add deposit amount to balance
        balance = balance + amount;

        // Display confirmation
        System.out.println("Deposited: INR " + amount);
    }

    /*
     * Method to withdraw money from account
     * Withdrawal allowed only if sufficient balance exists
     */
    void withdraw(double amount) {

        // Check if sufficient balance is available
        if (amount <= balance) {

            // Deduct amount from balance
            balance = balance - amount;

            // Display success message
            System.out.println("Withdrawn: INR " + amount);
        } else {

            // Display insufficient balance message
            System.out.println("Insufficient balance!");
        }
    }

    /*
     * Method to display current account balance
     */
    void displayBalance() {

        // Print current balance
        System.out.println("Current Balance: INR " + balance);
    }

    // Main method – program execution starts here
    public static void main(String[] args) {

        // Creating BankAccount object
        BankAccount account = new BankAccount();

        // Assigning account details
        account.accountHolder = "Ravi";
        account.accountNumber = 1234567890L;
        account.balance = 10000.0;

        // Perform deposit
        account.deposit(5000);

        // Perform withdrawal
        account.withdraw(3000);

        // Display balance
        account.displayBalance();
    }
}
