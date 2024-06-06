package Example.Encapsulation_1;

public class Main {
    public static void main(String[] args) {

//        Một ví dụ thực tế về đóng gói trong Java có thể là một hệ thống quản lý ngân hàng, nơi các thông tin nhạy cảm như số tài khoản,
//        số dư, và các giao dịch không nên được truy cập trực tiếp từ bên ngoài để bảo mật và tránh lỗi không mong muốn.

        BankAccount bankAccount = new BankAccount("123456789", "Nguyen Van A", 1000000);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Name: " + bankAccount.getAccountName());
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.deposit(500000);
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.withdraw(200000);
        System.out.println("Balance: " + bankAccount.getBalance());

        bankAccount.withdraw(9000000);
        System.out.println("Balance: " + bankAccount.getBalance());

    }
}
