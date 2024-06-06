package Example.Encapsulation_1;

public class BankAccount {
    private String accountNumber;
    private String Name;
    private double balance;

    public BankAccount(String accountNumber, String Name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.Name = Name;
        if (initialBalance >= 0){
            this.balance = initialBalance;
        }else {
            this.balance = 0;
            System.out.println("Initial balance must be non-negative.");
        }
    }
    // Phương thức lấy số tài khoản
    public String getAccountNumber() {
        return accountNumber;
    }
    // Phương thức lấy tên tài khoản
    public String getAccountName() {
        return Name;
    }

    // Phương thức lấy số dư tài khoản
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
// amount là số tiền cần rút, withdraw là phương thức rút tiền từ tài khoản,
// deposit là phương thức gửi tiền vào tài khoản, initialBalance là số tiền ban đầu của tài khoản,
// balance là số dư hiện tại của tài khoản.
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdraw amount must be positive.");
        }
    }
}
