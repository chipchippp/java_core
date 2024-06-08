package Example.TryCatch;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
        checkAge(19);

//      finally là một khối mã trong cấu trúc try-catch của Java,
//      được sử dụng để thực thi các đoạn mã nhất định sau khi khối try và
//      các khối catch đã được thực thi, bất kể có ngoại lệ xảy ra hay không.
//      Khối finally được sử dụng để đảm bảo rằng các tài nguyên được giải phóng
//      hoặc các hành động dọn dẹp được thực hiện sau khi khối try-catch kết thúc.

//        Trong Java, câu lệnh throw được sử dụng để ném một ngoại lệ.
//        Ngoại lệ là một sự kiện xảy ra trong quá trình thực thi chương trình và làm gián
//        đoạn luồng bình thường của các chỉ thị. Khi một ngoại lệ xảy ra, nó có thể được bắt
//        và xử lý bằng cách sử dụng các cấu trúc try-catch. Câu lệnh throw được sử dụng để ném một ngoại lệ,
//        và có nhiều loại ngoại lệ có sẵn trong Java, mỗi loại ngoại lệ đại diện cho một loại lỗi khác nhau
//        có thể xảy ra trong chương trình.
    }
}
