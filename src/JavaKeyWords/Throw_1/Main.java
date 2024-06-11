package JavaKeyWords.Throw_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        try {
            account.withdraw(150);  // Gọi phương thức với số tiền không hợp lệ
        } catch (IllegalArgumentException e) {
            // Xử lý ngoại lệ không kiểm tra
            System.err.println("IllegalArgumentException caught: " + e.getMessage());
        }

        System.out.println("Remaining balance: " + account.getBalance());
//Giải thích
//Lớp BankAccount: Chứa phương thức withdraw để rút tiền từ tài khoản.
//Phương thức withdraw: Kiểm tra xem số tiền rút có lớn hơn số dư hiện tại không.
// Nếu có, nó ném ra một ngoại lệ không kiểm tra IllegalArgumentException.
//Khối try-catch trong main: Gọi phương thức withdraw với một số tiền lớn hơn số dư hiện tại (150) và
// xử lý ngoại lệ nếu nó được ném ra.
//Tóm lại
//throw: Được sử dụng để ném ra một ngoại lệ cụ thể.
//Ngoại lệ kiểm tra: Phải được khai báo trong phần throws của phương thức
// hoặc được xử lý bằng khối try-catch.
//Ngoại lệ không kiểm tra: Không bắt buộc phải khai báo hoặc xử lý nhưng vẫn có thể được ném ra
// và xử lý tùy theo logic của ứng dụng.
//Sử dụng throw giúp bạn kiểm soát luồng chương trình và xử lý các tình huống bất thường một cách rõ ràng và tường minh.
    }
}
