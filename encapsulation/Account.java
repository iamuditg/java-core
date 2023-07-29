package encapsulation;

public class Account {

    private int accountNumber;
    private double balance;
    private Customer accountHolder;

    public Account(int accountNumber, double balance, Customer accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("amount = " + amount);
        }else {
            System.out.println("Invalid amount, Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $"+ amount + "successful");
        }else {
            System.out.println("insufficient balance or invalid amount. Withdrawal failed");
        }
    }
}
