// 2. Amount Class to represent transaction details
class Amount {
    private final double amount;
    private final TransactionType transactionType;

    // Constructor
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction: " + transactionType + ", Amount: " + amount;
    }
}
