import java.util.ArrayList;
import java.util.UUID;

public class BankAccount {
    // Private fields for account details
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    // Constructor to initialize a new bank account
    public BankAccount(String accountHolderName, String accountType, double initialDeposit) {
        this.accountNumber = UUID.randomUUID().toString(); // Generate a unique account number
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        addTransaction(new Transaction("Initial Deposit", initialDeposit, balance));
    }

    // Getter method for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction(new Transaction("Deposit", amount, balance));
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction(new Transaction("Withdrawal", amount, balance));
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Getter method for current account balance
    public double getBalance() {
        return balance;
    }

    // Getter method for transaction history
    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    // Private method to add a transaction to the history
    private void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
}
