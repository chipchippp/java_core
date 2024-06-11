package JavaKeyWords.Throws_1;

public class AgeValidator {
    public void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid");
        } else {
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.validate(16);  // Đây là ví dụ gọi phương thức với giá trị không hợp lệ
        } catch (InvalidAgeException e) {
            // Xử lý ngoại lệ tùy chỉnh
            System.err.println("InvalidAgeException caught: " + e.getMessage());
        }
//  Giải thích
//Ngoại lệ tùy chỉnh InvalidAgeException: Được tạo bằng cách mở rộng lớp Exception.
//Phương thức validateAge: Khai báo rằng nó có thể ném ra InvalidAgeException bằng cách sử dụng từ khóa throws.
//Khối try-catch trong main: Xử lý ngoại lệ InvalidAgeException khi gọi phương thức validateAge.
//Tóm lại
//Từ khóa throws trong Java rất hữu ích để khai báo các ngoại lệ mà một phương thức có thể ném ra,
// giúp các lập trình viên khác biết trước để xử lý hoặc ném lại các ngoại lệ này.
// Điều này giúp quản lý lỗi và duy trì sự ổn định của ứng dụng một cách hiệu quả.





//        Trong Java, từ khóa throw được sử dụng để ném ra (throw) một ngoại lệ (exception)
//        một cách tường minh trong mã của bạn. Khi một ngoại lệ được ném ra bằng từ khóa throw,
//        luồng hiện tại sẽ dừng lại và chuyển sang xử lý ngoại lệ bởi các khối catch tương ứng hoặc
//        nó sẽ được đẩy lên call stack nếu không có khối catch phù hợp.
//
//Giải thích chi tiết
//throw: Dùng để ném ra một ngoại lệ. Ngoại lệ này có thể là một ngoại lệ kiểm tra (checked exception)
// hoặc không kiểm tra (unchecked exception).
//Ngoại lệ kiểm tra (Checked Exception):
// Là các ngoại lệ bắt buộc phải được khai báo hoặc xử lý. Ví dụ: IOException.
//Ngoại lệ không kiểm tra (Unchecked Exception):
// Là các ngoại lệ không bắt buộc phải được khai báo hoặc xử lý. Ví dụ: NullPointerException.

//        Giải thích
//Lớp InvalidAgeException: Đây là một ngoại lệ tùy chỉnh kế thừa từ Exception.
//Phương thức validateAge: Kiểm tra xem tuổi có hợp lệ không.
// Nếu tuổi nhỏ hơn 18, nó ném ra một ngoại lệ InvalidAgeException với một thông báo.
//Khối try-catch trong main: Gọi phương thức validateAge với một tuổi không hợp lệ (16) và
// xử lý ngoại lệ nếu nó được ném ra.
    }
}
