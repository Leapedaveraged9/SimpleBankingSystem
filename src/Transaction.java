import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    // Private fields for transaction details
    private String transactionID;
    private LocalDateTime date;
    private String type;
    private double amount;
    private double balanceAfterTransaction;

    // Constructor to initialize a new transaction
    public Transaction(String type, double amount, double balanceAfterTransaction) {
        this.transactionID = UUID.randomUUID().toString(); // Generate a unique transaction ID
        this.date = LocalDateTime.now(); // Set the current date and time
        this.type = type;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    // Getter methods for transaction details
    public String getTransactionID() {
        return transactionID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalanceAfterTransaction() {
        return balanceAfterTransaction;
    }
}
