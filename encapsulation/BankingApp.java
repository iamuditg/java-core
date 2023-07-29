package encapsulation;

public class BankingApp {
    public static void main(String[] args) {
        // Creating a new customer
        Customer customer1 = new Customer("John Doe", "123 Main St, City", "123-456-7890");

        // Creating a new account for the customer
        Account account1 = new Account(1001, 1000.0, customer1);

        // Performing operations on the account
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolder().getName());
        System.out.println("Balance: $" + account1.getBalance());

        account1.deposit(500.0);
        account1.withdraw(200.0);

        System.out.println("Updated Balance: $" + account1.getBalance());
    }
}

