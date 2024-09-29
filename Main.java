public class Main {
    public static void main(String[] args) {
        // Create a personal account
        PersonalAccount account = new PersonalAccount(12345, "Adakhan");

        // Perform transactions
        account.deposit(1000);
        account.withdraw(200);
        account.deposit(500);

        // Print account info and transaction history
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
        account.printTransactionHistory();
    }
}
