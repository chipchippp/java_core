package JavaKeyWords.Throw_1;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
