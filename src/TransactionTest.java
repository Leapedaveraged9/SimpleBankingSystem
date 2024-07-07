public class TransactionTest {
    public static void main(String[] args) {
        // Create a new transaction
        Transaction transaction = new Transaction("Deposit", 200, 700);
        
        // Print transaction details
        System.out.println("Transaction ID: " + transaction.getTransactionID());
        System.out.println("Date: " + transaction.getDate());
        System.out.println("Type: " + transaction.getType());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Balance after transaction: " + transaction.getBalanceAfterTransaction());
    }
}
