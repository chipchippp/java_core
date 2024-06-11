package JavaKeyWords.Throws_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public void readFile(String fileName) throws IOException {
        // Đọc một file
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        //        Trong Java, từ khóa throws được sử dụng trong khai báo phương thức để chỉ ra rằng
//        phương thức đó có thể ném ra (throw) một hoặc nhiều ngoại lệ (exceptions).
//        Điều này thông báo cho các lập trình viên khác rằng họ cần xử lý (catch) hoặc
//        khai báo tiếp tục ném (rethrow) các ngoại lệ này khi gọi phương thức.

//        Giải thích chi tiết
//Ngoại lệ kiểm tra (Checked Exceptions): Là những ngoại lệ mà trình biên dịch buộc phải kiểm tra.
// Các ngoại lệ này phải được khai báo trong phần throws của phương thức hoặc phải được xử lý bằng một khối try-catch.
//Ngoại lệ không kiểm tra (Unchecked Exceptions): Là những ngoại lệ mà trình biên dịch không buộc phải kiểm tra.
// Chúng thường là các ngoại lệ con của RuntimeException.


//        Giải thích
//Phương thức readFile: Khai báo rằng nó có thể ném ra IOException bằng cách sử dụng từ khóa throws.
//Khối try-catch trong main: Xử lý ngoại lệ IOException khi gọi phương thức readFile.
        FileReadingExample fileReadingExample = new FileReadingExample();
        try {
            fileReadingExample.readFile("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
