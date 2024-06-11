package JavaKeyWords.Throws_1;

public class InvalidAgeException extends Exception{
//    Ví dụ về throws với ngoại lệ tùy chỉnh
//Giả sử chúng ta có một ngoại lệ tùy chỉnh InvalidAgeException và
// một phương thức kiểm tra tuổi có thể ném ra ngoại lệ này.
    public InvalidAgeException(String message) {
        super(message);
    }
}
