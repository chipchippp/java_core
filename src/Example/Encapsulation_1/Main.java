package Example.Encapsulation_1;

public class Main {
    public static void main(String[] args) {

// Đóng gói (Encapsulation) là một trong những nguyên tắc cơ bản của lập trình hướng đối tượng (OOP). Nó đề cập đến việc ẩn giấu dữ liệu (biến) và
// các phương thức thao tác trên dữ liệu đó trong một lớp, để bảo vệ dữ liệu khỏi truy cập trái phép và thay đổi không mong muốn từ bên ngoài.
// Thay vào đó, việc truy cập và thay đổi dữ liệu phải thông qua các phương thức công khai (public methods), thường được gọi là các phương thức getter và setter.

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
