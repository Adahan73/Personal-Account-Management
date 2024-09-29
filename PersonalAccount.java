class PersonalAccount {
    private final int accountNumber;
    private final String accountHolder;
    private double balance;
    private final Amount[] transactions;
    private int transactionCount;

    // Constructor
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100]; // Default capacity for transactions
        this.transactionCount = 0;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions[transactionCount++] = new Amount(amount, TransactionType.DEPOSIT);
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions[transactionCount++] = new Amount(amount, TransactionType.WITHDRAWAL);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to print transaction history
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
        if (transactionCount == 0) {
            System.out.println("No transactions found.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to get account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}
