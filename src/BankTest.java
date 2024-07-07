public class BankTest {
    public static void main(String[] args) {
        // Create a new bank
        Bank bank = new Bank();

        // Create two new bank accounts
        BankAccount account1 = bank.createAccount("John Doe", "Checking", 500);
        BankAccount account2 = bank.createAccount("Jane Doe", "Savings", 1000);

        // Test deposit and withdraw methods
        bank.deposit(account1.getAccountNumber(), 200);
        bank.withdraw(account1.getAccountNumber(), 100);

        // Print balances
        System.out.println("Balance for John Doe: " + bank.getBalance(account1.getAccountNumber()));
        System.out.println("Balance for Jane Doe: " + bank.getBalance(account2.getAccountNumber()));

        // Print transaction history for John Doe
        for (Transaction t : bank.getTransactionHistory(account1.getAccountNumber())) {
            System.out.println(t.getType() + ": " + t.getAmount() + " | Balance: " + t.getBalanceAfterTransaction());
        }
    }
}
