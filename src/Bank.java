import java.util.ArrayList;

public class Bank {
    // Private fields for bank accounts and account numbering
    private ArrayList<BankAccount> accounts;
    private int nextAccountNumber;

    // Constructor to initialize the bank
    public Bank() {
        this.accounts = new ArrayList<>();
        this.nextAccountNumber = 1;
    }

    // Method to create a new bank account
    public BankAccount createAccount(String accountHolderName, String accountType, double initialDeposit) {
        BankAccount newAccount = new BankAccount(accountHolderName, accountType, initialDeposit);
        accounts.add(newAccount);
        return newAccount;
    }

    // Method to find an account by its number
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null; // Return null if account is not found
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to get the balance of an account
    public double getBalance(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account not found.");
            return 0;
        }
    }

    // Method to get the transaction history of an account
    public ArrayList<Transaction> getTransactionHistory(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            return account.getTransactionHistory();
        } else {
            System.out.println("Account not found.");
            return null;
        }
    }
}
