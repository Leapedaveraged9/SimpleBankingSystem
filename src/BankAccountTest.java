public class BankAccountTest {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("John Doe", "Checking", 500);
        System.out.println("Initial Balance: " + account.getBalance());

        // Test deposit method
        account.deposit(200);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Test withdraw method
        account.withdraw(100);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Print transaction history
        for (Transaction t : account.getTransactionHistory()) {
            System.out.println(t.getType() + ": " + t.getAmount() + " | Balance: " + t.getBalanceAfterTransaction());
        }
    }
}
